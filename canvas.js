(function(){
  window.addEventListener('load',draw);
  function draw(){
    let canvas=document.getElementById("canvas");
    let ctx=canvas.getContext("2d");
    ctx.fillStyle="#ff0000";
    ctx.fillRect(0,0,300,300);
  }
})();
