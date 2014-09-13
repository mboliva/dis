define(['services/mainSrv'], function(mainSrv){
	
	mainSrv.factory('formSrv',['$resource', function ($resource){
		return $resource('http://localhost:8080/sit/:dto/:method');		
	}]);
});