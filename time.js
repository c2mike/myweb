function showtime()
{
    var date = new Date();
    var hour = date.getHours();
    var min = date.getMinutes();
    var sec = date.getSeconds();
    hour = hour<10?"0"+hour:hour;
    min = min<10?"0"+min:min;
    sec = sec<10?"0"+sec:sec;
    document.getElementById("show").innerText=hour+":"+min+":"+sec;
    setTimeout("showtime()",1000);
    setTimeout("move()",1000);
}

function move()
{
    document.getElementById("picture").style.left=Math.random()*500+"px";
    document.getElementById("picture").style.top=Math.random()*500+"px";
    setTimeout("move()",1000);
}