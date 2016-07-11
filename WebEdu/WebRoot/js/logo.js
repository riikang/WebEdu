 function MakeLogo() {
            var canvas = document.getElementById("canvas");
            if (canvas.getContext) {
                var ctx = canvas.getContext("2d");
                ctx.arc(17, 17, 15, 0, 9.42, true); // 开始画圆
                ctx.lineWidth = 3;
                ctx.lineJoin = 'round';
                ctx.lineCap = 'round';
                ctx.strokeStyle = '#FFF';
                ctx.shadowBlur = 4; //阴影模糊程度，默认为0，数值越大，模糊程度越高，感觉越明显
                ctx.shadowColor = '#909090'; //阴影颜色
                ctx.shadowOffsetX = 1; //横轴的阴影像素
                ctx.shadowOffsetY = 1; //纵轴的阴影像素
                //Create the F
                ctx.moveTo(41,35); //将数据上下文的位置移动到（41，35）的坐标位置
                ctx.lineTo(41, 2); //将数据上下文的位置移动到（41，35）的坐标位置
                ctx.lineTo(61,2);
                ctx.moveTo(41,15);
                ctx.lineTo(71,15);
                ctx.moveTo(117, -1); //Create the L
                ctx.lineTo(117, 32);
                ctx.lineTo(142, 32);
				ctx.moveTo(149, -1); //Create the L
                ctx.lineTo(149, 32);
                ctx.lineTo(174, 32);
				ctx.moveTo(205, 8);
				ctx.arc(195, 17, 15, 1.75*Math.PI, 0.25*Math.PI, true); // Create the C
                ctx.lineWidth = 3;
                ctx.lineJoin = 'round';
                ctx.lineCap = 'round';
                ctx.strokeStyle = '#FFF';
                ctx.stroke();
                //stroke方法使用lineWidth，lineCap，lineJoin，以及strokeStyle对所有的子路径进行填充         
                ctx.save();
                //保存数据上下文
				ctx.beginPath(); //Create Imge Star
                ctx.moveTo(78, 2); 
                var img1 = new Image();
                img1.src = "images/logo.png";
                img1.onload = function () {
                    ctx.drawImage(img1, 78, 2);
                    ctx.stroke();
                    ctx.save();
                }
				ctx.stroke();
				ctx.save();
                var url = canvas.toDataURL();
                console.debug(url);
                ctx.beginPath();
                ctx.shadowBlur = 1;
                ctx.shadowOffsetX = 0;
                ctx.shadowOffsetY = 0;
            }
     }