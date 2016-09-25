

var score = 0;
    var timesChecked = 0;
    var tweet = "";
    var user_id = "";
    var tweet_id = "";
    var report = {score: score, timesChecked: timesChecked, tweet: tweet, user_id: user_id, tweet_id: tweet_id};
    var name = "";
    var daysGood = 0;
    var user = {name: name, daysGood: daysGood};
    var users = [];
    var reports = [];
    var reportCounter = 0;
    var userCounter = 0;
    //getters and setters
    function incrementScore(){
        score++;
    }
    function incrementTimesChecked(){
        timesChecked++;
    }
    function loadReports(user_id){
        for(var i = 0; i < reports.length; i++){
            if(tweet_id == reports[i].user_id){
                return reports[i];
            }
        }
        return null;
    }
    function incrementDaysGood(){
        daysGood++;
    }
    var element = document.getElementById("ChangeText");
	if(!element){ //This checks if the element is falsy, which includes null,NAN,""undefined, and some others
		element = {};
	}
    var category = document.getElementById("category");
	if(!category){
		category = {};
	}
    var r1 = {"score": 0, "timesChecked":0, "tweet":"", "user_id":"", "tweet_id":""};
    yesElement = document.getElementById("yes");
	if(!yesElement){
		yesElement = {};
	}
	yesElement["onclick"] = yes();
	
    var noElement = document.getElementById("no");
	if(!noElement){
		noElement = {};
	}
	noElement["onclick"] = no();
    var unsureElement = document.getElementById("unsure")
	if(!unsureElement){
		unsureElement = {};
	}
	unsureElement["onclick"] = unsure();
    
	category.innerHTML = "Harassment";
    //(dont need to change this) element.innerHTML = "Cincinatti Zoo";
    function yes(){
    	element["innerHTML"] = "Thanks for submitting your response, the poster will be dealt with accordingly.";
    	alert("user pressed yes");
      r1.score++;

      r1.timesChecked++;
        // need to increment score by 1
        // need to increment timesChecked
        // need to check if timesChecked = 5
    }
    function no(){
    	element.innerHTML = "Thanks for submitting your response, the poster will be dealt with accordingly."
    	alert("user pressed no");
        // need to increment timesChecked
        // need to check if timesChecked = 5
    }
    function unsure(){
    	element.innerHTML = "You aren't very helpful but thanks for trying :)"
    	alert("user pressed perhaps");
        // need to increment score by 0.5
        // need to increment timesChecked
        // need to check if timesChecked = 5
    }

    function parse(){
	  console.log("Hi");
	  console.log(data.reports[0].tweet);
    }
	
	
	
	//parse();
	element.innerHTML = data.reports[0].tweet;
	/*
    var rr = {score:0, timesChecked:5, tweet:"haha banana", user_id:"101010", tweet_id:"1010101010"};
    alert(rr.score);
	*/
	