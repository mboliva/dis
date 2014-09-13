define(['controllers/mainCtr','controllers/modalCtr'], function(mainCtr){
	
	mainCtr.controller('proposalsCtr',['$scope','$location','$routeParams','$anchorScroll','$modal','commentSrv',function ($scope,$location,$routeParams,$anchorScroll,$modal,commentSrv){
		
		$location.hash('top');
		
		$scope.proposals = [];		
		$scope.spinner = 0;
		$scope.maxResults = -1;
  		$scope.pageNumber = 1;
  		$scope.pageSize = 3;
  		$scope.category = null;
  		$scope.entity='';
  		$scope.urlBack='#';
  		
  		if($routeParams.entity=='partido'){
  			$scope.entity='proposal';
  			$scope.urlBack = '/propuestas/partido';
  		}else{
  			$scope.entity='comment';
  			$scope.urlBack = '/propuestas/tuspropuestas';
  		}
  		
  		//Funciones para lista de propuestas o comentarios	
  		if(!$routeParams.detail){
  			$scope.categories = commentSrv.query({entity:'category',method:'list',id:1});
  			
  			$scope.loadProposals = function(){
  				$scope.spinner = 1;
  		  		commentSrv.get({entity:$scope.entity,method:'listByDistrict',id:1,page_number:$scope.pageNumber,page_size:$scope.pageSize},function(data){
  		  			$scope.spinner = 0;	
  		  			$scope.proposals = data.list;
  					$scope.maxResults = data.maxResults;
  				}, function(error){
  					$scope.spinner = 0;
  				});
  		  		
  			};
  			
  			$scope.loadProposals();
  			
  			$scope.changeCategory = function(category){
  				if(category){
  					var filter = {};
  					
  					filter.conjunctions={};
  					filter.conjunctions = {"district.id" : 1 , "category.id" : category};  					
  					filter.orders = {};
  					filter.orders.likes = 'desc';
  					filter.pageNumber = $scope.pageNumber;
  					filter.pageSize = $scope.pageSize;
  					$scope.spinner = 1;
  					commentSrv.save({entity:$scope.entity,method:'listByCriteria'},filter,function(data){
  						$scope.spinner = 0;
  						$scope.proposals = data.list;
  						$scope.maxResults = data.maxResults;
  					}, function(error){
  	  					$scope.spinner = 0;
  	  				});
  				}else{
  					$scope.loadProposals();
  				}
  			};
  			
  			$scope.detailPorposal = function(proposal){
  				sessionStorage.setItem('proposalDetail',JSON.stringify(proposal));
  				$location.path("/propuesta/detalle/"+$routeParams.entity);
  			};
  			
  			$scope.pageChanged = function(page){
  				$scope.pageNumber=page;
  				if($scope.category){
  					$scope.changeCategory($scope.category);
  				}else{
  					$scope.loadProposals();
  				}  				
  				$location.hash('top');
  	  		    $anchorScroll();
  			};
  			
  		}else{
  			$scope.d_proposal = JSON.parse(sessionStorage.getItem('proposalDetail'));
  			$scope.goBack = function(){
  				sessionStorage.removeItem('proposalDetail');
  				$location.path($scope.urlBack);
  			};
  		}
  		
		
		
		$scope.like = function(proposal){
			var _msg = '';			
			var likeVar = $scope.entity.charAt(0)+proposal.id;
			var likeStorage = localStorage.getItem(likeVar);
			if(likeStorage){
				_msg="Usted ya votó por esta propuesta";
				var modalInstance = $modal.open({
					template : '<div class="modal-header"><h3>Barck Obama</h3></div>'+
								'<div class="modal-body"><p>'+_msg+'</p></div>'+
								'<div class="modal-footer"><button class="btn btn-danger" ng-click="closeModal()">Regresar</button></div>',
					controller : 'modalCtr'
					
				});
			}else{
				commentSrv.put({entity:$scope.entity,method:'incrementLikes',id:proposal.id},function(data){
					proposal.likes = data.likes;
					localStorage.setItem(likeVar, '1');
					_msg = 'Gracias por emitir su voto, lo tomaremos en cuenta';
		  			var modalInstance = $modal.open({
						template : '<div class="modal-header"><h3>Barack Obama</h3></div>'+
									'<div class="modal-body"><p>'+_msg+'</p></div>'+
									'<div class="modal-footer"><button class="btn btn-danger" ng-click="closeModal()">Regresar</button></div>',
						controller : 'modalCtr'
						
					});					
				});
			}			
		};
		$scope.showLogo = function(){
			var modalInstance = $modal.open({
				template : '<div class="col-md-10 col-md-offset-1">' +
					'<button type="button" class="thumbnail" ng-click="closeModal()"><img src="img/logo_x_full.jpg" class="img-responsive img-modal-logo" alt="Me gusta"></button>'+
					'<p class="text-center">{{d_proposal.likes}}</p></div>',
				controller : 'modalCtr'
				
			});
		};
		
	}]);
	
});