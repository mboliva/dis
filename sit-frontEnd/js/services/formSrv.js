define(['services/mainSrv'], function(mainSrv){
	
	mainSrv.factory('formSrv',['$resource', function ($resource){
		//return $resource('http://192.168.1.35:8080/escuchameadmin/:entity/:method');		
		return $resource('http://www.systemlab.com.pe/escuchameadmin/:entity/:method');
	}]);
});