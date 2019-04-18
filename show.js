var i = 0;
var  show = setInterval(function(){
    if(i<10)
    {
        console.log(i++);
    }
    else
    {
        clearInterval(show);
    }
},1000);
var show2 = setTimeout(function(){console.log("setTimeOut")},2000)