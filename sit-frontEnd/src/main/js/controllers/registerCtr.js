define(['controllers/mainCtr','controllers/modalCtr','services/formSrv'], function(mainCtr){
	
	mainCtr.controller('formCtr',['$scope','$location','$modal','formSrv','commentSrv',function ($scope,$location,$modal,formSrv,commentSrv){
		
//		$scope.comment = {};
//		$scope.comment.district = {};
//		$scope.comment.district.id = 1;
//		
//		$scope.categories = commentSrv.query({entity:'category',method:'list',id:1});
//		
//		$scope.send_comment = function(){
//			if($scope.category){
//				$scope.comment.category = {};
//				$scope.comment.category.id = $scope.category;
//				formSrv.save({entity:'comment',method:'add'},$scope.comment,function(data){
//					if(data[0]=="1"){
//						var modalInstance = $modal.open({
//							template : '<div class="modal-header"><h3>Barack Obama</h3></div>'+
//										'<div class="modal-body"><p> Gracias por enviar su propuesta </p></div>'+
//										'<div class="modal-footer"><button class="btn btn-danger" ng-click="closeModal()">Regresar</button></div>',
//							controller : 'modalCtr'
//							
//						});
//						$location.path('/propuestas/tuspropuestas');
//					}else{
//						var modalInstance = $modal.open({
//							template : '<div class="modal-header"><h3>Barack Obama</h3></div>'+
//										'<div class="modal-body"><p> Ocurrió un error, intentelo de nuevo </p></div>'+
//										'<div class="modal-footer"><button class="btn btn-danger" ng-click="closeModal()">Regresar</button></div>',
//							controller : 'modalCtr'
//							
//						});
//					}
//				});
//			}else{
//				alert("Seleccione una Categoria");
//			}
//
//		};
//		
//		$scope.showLogo = function(){
//  			var modalInstance = $modal.open({
//				template : '<div class="col-md-10 col-md-offset-1">' +
//					'<button type="button" class="thumbnail" ng-click="closeModal()"><img src="img/logo_x_full.jpg" class="img-responsive img-like" alt="Me gusta"></button>'+
//					'<p class="text-center">{{d_proposal.likes}}</p></div>',
//				controller : 'modalCtr'
//				
//			});
//		};
 		
	}]);
	
});