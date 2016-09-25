document.getElementById("yes").onclick = yes;
document.getElementById("no").onclick = no;
document.getElementById("perhaps").onclick = perhaps;
var element = document.getElementById("ChangeText");
var category = document.getElementById("category");
category.innerHTML = "HI";
element.innerHTML = "Cincinatti Zoo";
function yes(){
	element.innerHTML = "fuck you"
	alert("user pressed yes");
}
function no(){
	element.innerHTML = "same"
	alert("user pressed no");
}
function perhaps(){
	element.innerHTML = "???"
	alert("user pressed perhaps");
}