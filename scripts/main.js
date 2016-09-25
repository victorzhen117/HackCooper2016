document.getElementById("yes").onclick = yes;
document.getElementById("no").onclick = no;
document.getElementById("unsure").onclick = unsure;
var element = document.getElementById("ChangeText");
var category = document.getElementById("category");
category.innerHTML = "Harassment";
<! (dont need to change this) element.innerHTML = "Cincinatti Zoo"; 
function yes(){
	element.innerHTML = "Thanks for submitting your response, the poster will be dealt with accordingly."
	alert("user pressed yes");
    <! need to increment score by 1
    <! need to increment timesChecked
    <! need to check if timesChecked = 5 
}
function no(){
	element.innerHTML = "Thanks for submitting your response, the poster will be dealt with accordingly."
	alert("user pressed no");
    <! need to increment timesChecked    
    <! need to check if timesChecked = 5 
}
function unsure(){
	element.innerHTML = "You aren't very helpful but thanks for trying :)"
	alert("user pressed perhaps");
    <! need to increment score by 0.5
    <! need to increment timesChecked
    <! need to check if timesChecked = 5 
}
