define(['controllers/mainCtr'], function(mainCtr){
	
	mainCtr.controller('homeCtr',['$scope','$location','$timeout',function ($scope,$location,$timeout){
		$scope.myInterval = 1500;
		var slides = $scope.slides = [];
		
		var newWidth = 600 + slides.length;
		
		slides.push({
		      			image: 'img/intro/metropolitano.jpg'
		 			},{
		      			image: 'img/intro/logo-lima.jpg'
		 			},{
		      			image: 'img/intro/tren.jpg'
		 			}
		);
		
	}]);
	
});