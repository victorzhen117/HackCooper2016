document.getElementById("yes").onclick = yes;
document.getElementById("no").onclick = no;
document.getElementById("perhaps").onclick = perhaps;
var element = document.getElementById("ChangeText");
element.innerHTML = "Cincinatti Zoo";
function yes(){
	alert("user pressed yes");
}
function no(){
	alert("user pressed no");
}
function perhaps(){
	alert("user pressed perhaps");
}