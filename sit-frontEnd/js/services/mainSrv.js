define(["angularResource"],function(){
	var mainSrv = angular.module('mainSrv',['ngResource']);
	
	mainSrv.factory('commentSrv',['$resource', function ($resource){
		return $resource('http://www.systemlab.com.pe/escuchameadmin/:entity/:method/:id/:page_number/:page_size',null,
		//return $resource('http://192.168.1.35:8080/escuchameadmin/:entity/:method/:id/:page_number/:page_size',null,
				{
					'put': { method:'PUT' ,params: {entity : '@entity', method:'@method', id: '@id'} }
				});
	}]);
	return mainSrv;
});