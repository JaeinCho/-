var canvas;
var ctx;
var player1;
var px, py;
var pw = 50, ph = 80;
var player2;
var p2x, p2y;
var p2h = 50, p2h = 80;
var bx, by;
var b2x, b2y;
var keysDown = {};
var state_start = 0;
var state_wait = 1;
var state_game = 2;
var state_result = 3;
var state = state_start;
var cnt = 60;
var score1 = 0;
var score2 = 0;

var canmove1up = true;
var canmove1down = true;
var canmove1left = true;
var canmove1right = true;
var canmove2up = true;
var canmove2down = true;
var canmove2left = true;
var canmove2right = true;

//var ground=new Image(); ground.src="image/ground.png";
var background = new Image(); background.src = "image/background.png";
var bullet = new Image(); bullet.src = "image/bullet.png";
var depencer = new Image(); depencer.src = "image/depencer.png";

window.onload = function() {
    canvas = document.getElementById("canvas");
    ctx = canvas.getContext("2d");
    player1 = new Image();
    player1.src = "image/player1.png";
    player2 = new Image();
    player2.src = "image/player2_left.png";
    setInterval(going, 30);
}

addEventListener("keydown", function (e) {
	keysDown[e.keyCode] = true;
}, false);

addEventListener("keyup", function (e) {
	delete keysDown[e.keyCode];
}, false);

function bullet() {
    bx = pw / 2; by = ph / 2;
    b2x = p2w / 2; b2y = p2h / 2;
}

function startGame() {
    px = canvas.width / 4 - 25, py = canvas.height / 2 - 40;
    p2x = canvas.width / 4 * 3 - 25, p2y = canvas.height / 2 - 40;
    alert('Ready,');
    alert('Set,');
    alert('Start!!');
}

function going() {
    switch(state){
        case state_start:
        if(13 in keysDown) {
            state = state_wait;
        }
        break;
        
        case state_wait:
        if(13 in keysDown) {
            startGame();
            state = state_game;
        }
        break;

        case state_game:
        if(canmove1left){
            if(65 in keysDown) {
                px -= 3;
            }
        }
        if(canmove1up) {
            if(87 in keysDown) {
                py -= 3;
            }
        }
        if(canmove1right) {
            if(68 in keysDown) {
                px += 3;
            }
        }
        if(canmove1down) {
            if(83 in keysDown) {
                py += 3;
            }
        }
        if(canmove2left) {
            if(37 in keysDown) {
                p2x -= 3;
            }
        }
        if(canmove2up) {
            if(38 in keysDown) {
                p2y -= 3;
            }
        }
        if(canmove2right) {
            if(39 in keysDown) {
                p2x += 3;
            }
        }
        if(canmove2down) {
            if(40 in keysDown) {
                p2y += 3;
            }
        }
        if(16 in keysDown) {
            bx += 10;
        }
        if(32 in keysDown) {
            b2x -= 10;
        }

        if(py >= 600 - 80) {
            canmove1down = false;
        }
        else if(py < 600 - 80) {
            canmove1down = true;
        }
        if(py <= 0) {
            canmove1up = false;
        }
        else if(py > 0) {
            canmove1up = true;
        }
        if(px >= 520 - 50) {
            canmove1right = false;
        }
        else if(px < 520 - 50) {
            canmove1right = true;
        }
        if(px <= 0) {
            canmove1left = false;
        }
        else if(px > 0) {
            canmove1left = true;
        }
        if(p2y >= 600 - 80) {
            canmove2down = false;
        }
        else if(p2y < 600 - 80) {
            canmove2down = true;
        }
        if(p2y <= 0) {
            canmove2up = false;
        }
        else if(p2y > 0) {
            canmove2up = true;
        }
        if(p2x >= 1100 - 50) {
            canmove2right = false;
        }
        else if(p2x < 1100 - 50) {
            canmove2right = true;
        }
        if(p2x <= 580) {
            canmove2left = false;
        }
        else if(p2x > 580) {
            canmove2left = true;
        }
        break;
    }
    draw();
}

// function countdown() {
//     if(cnt == -1){
//         state = state_result;
//     }
//     else{
//         document.all.choonDiv.innerHTML = "남은시간 : "+cnt+"초";
//         setTimeout("countdown()",1000);
//         cnt--;
//     }
// }

function draw(){
    ctx.clearRect(0,0,canvas.width,canvas.height);
    switch(state){
        case state_start:
        ctx.drawImage(background, 0, 0);
        ctx.fillStyle = "yellow";
        ctx.font = "60px Malgun Gothic";
        ctx.textAlign = "center";
        ctx.textBaseline = "middle";
        ctx.fillText("일촉즉발 총격전", canvas.width / 2, canvas.height / 2 - 50);
        ctx.font = "20px Malgun Gothic";
        ctx.fillStyle = "white";
        ctx.fillText("Enter 키를 누르면 게임이 시작됩니다.", canvas.width / 2, canvas.height / 2 + 30);
        break;
        case state_wait:
        ctx.fillStyle="white";
        ctx.font="50px Malgun Gothic";
        ctx.textAlign="center";
        ctx.textBaseline="middle"; 
        ctx.fillText("상대 찾기", canvas.width / 2, canvas.height / 2 - 200);
        break;
        case state_game:
        // ctx.drawImage(background,0,0);    
        ctx.drawImage(depencer, 520, 0);
        ctx.drawImage(player1, px, py);
        ctx.drawImage(player2, p2x, p2y);
        break;
        case state_result:
        break;
    }
}