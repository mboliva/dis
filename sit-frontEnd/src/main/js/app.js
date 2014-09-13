define(["controllers/mainCtr","controllers/homeCtr","controllers/proposalsCtr","controllers/formCtr","angularRoute","bootstrapui"],function(){
	
	var app = angular.module("app",[
		'ngRoute',
		'mainCtr',
		'ui.bootstrap'
	]);

	app.config(['$routeProvider','$httpProvider',
		function($routeProvider,$httpProvider){
			$routeProvider
			.when("/",{
				templateUrl : "templates/home.html",
				controller  : "homeCtr"
			})
			.when("/propuestas/:entity",{
				templateUrl : "templates/proposals.html",
				controller  : "proposalsCtr"
			})
			.when("/propuesta/:detail/:entity",{
				templateUrl : "templates/detailProposal.html",
				controller  : "proposalsCtr"
			})
			.when("/formulario",{
				templateUrl : "templates/form.html",
				controller  : "formCtr"
			})
			.otherwise({ redirectTo : "/bienvenido"});
			
		}]);
	angular.bootstrap(document, ['app']);
	return app;
});