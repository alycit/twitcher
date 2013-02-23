$.fn.equalHeights = function() {
	var currentTallest = 0;
	
	$(this).children().each(function(i){
		if ($(this).height() > currentTallest) { 
			currentTallest = $(this).height(); 
			//console.log("Current div height: " + currentTallest);
		} 
	});
	
	//console.log("Tallest: " + currentTallest);
	$(this).children().css({'min-height': currentTallest}); 
	$(this).children().css({'max-height': currentTallest}); 
	
	return this;
};

