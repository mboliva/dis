define(['controllers/mainCtr'], function(mainCtr){
	
	mainCtr.controller('modalCtr',['$scope','$modalInstance',function($scope,$modalInstance){
			
			$scope.closeModal = function () {
				$modalInstance.dismiss('cancel');
			};

		}]);
	
});