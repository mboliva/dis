define(['controllers/mainCtr'], function(mainCtr){
	
	mainCtr.controller('homeCtr',['$scope','$location','$timeout',function ($scope,$location,$timeout){
		$scope.myInterval = 3000;
		var slides = $scope.slides = [];
		
		var newWidth = 600 + slides.length;
		
		slides.push({
		      			image: 'img/intro/photo.png'
		 			},{
		      			image: 'img/intro/logo.png'
		 			}
		);
		
	}]);
	
});