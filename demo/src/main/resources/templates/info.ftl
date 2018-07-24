<style>
        img {
        max-width: 100%;
        max-height: 100%; 
        vertical-align:top;
    }
    
    
    .Up1{
        animation: Up_ 1s forwards;
        animation-delay: 0.5s;
        image-rendering: auto;
        position: absolute;
  right: 73%;
        width: 15%;
        height: auto;
        transform: translateX(0%);
        top: 150%;
        overflow: hidden;
        transform: translateY(-50%);
    }
    
    .Up2{
        animation: Up_ 1s forwards;
        animation-delay: 0.3s;
        image-rendering: auto;
        position: absolute;
        
  right: 43%;
        width: 15%;
        height: auto;
        transform: translateX(0%);
        top: 150%;
        overflow: hidden;
        transform: translateY(-50%);
    }
    
    .Up3{
        animation: Up_ 1s forwards;
        animation-delay: 0.4s;
        image-rendering: auto;
        position: absolute;
  right: 13%;
        width: 15%;
        height: auto;
        transform: translateX(0%);
        top: 150%;
        overflow: hidden;
        transform: translateY(-50%);
    }

    @keyframes Up_ {
      0%    {top: 150%;
        transform-origin: 50% 50%;}
      
      100%{top: 80%;}
    }

    @keyframes _ {
      0%    {transform: rotateZ(0deg);top: 65%;

        transform-origin: 50% 70%;
        width: 15%;
        position: absolute;}

      100%{transform: rotateZ(15deg);
        position: absolute;
        transform-origin: 50% 70%;

        width: 17%;
        top: 65%;}
    }
    @keyframes __ {

      0%{transform: rotateZ(15deg);
        top: 65%;
        width: 17%;
        transform-origin: 50% 70%;
        }
      100%    {transform: rotateZ(0deg);top: 65%;

        transform-origin: 50% 70%;
        width: 15%;}
    }
    </style>

    <script>
            function f(){
            document.getElementById("formcreat").innerHTML = "<form method='POST'><input name='name' type='text'/><input name='pass' type='text'/><input type='submit' value='게시하기'/></form>";
            }

            function s(params) {
                if(document.getElementsByClassName(params)[0].style.getPropertyValue("animation-play-state")!="running" && document.getElementsByClassName(params)[0].style.getPropertyValue("animation-name")!="_"){
                document.getElementsByClassName(params)[0].style.setProperty("animation","_");
                document.getElementsByClassName(params)[0].style.setProperty("animation-duration","0.5s");
                document.getElementsByClassName(params)[0].style.setProperty("animation-fill-mode","forwards");
                }
            }
            function sout(params) {
                if(document.getElementsByClassName(params)[0].style.getPropertyValue("animation-play-state")!="running" && document.getElementsByClassName(params)[0].style.getPropertyValue("animation-name")!="__"){
                document.getElementsByClassName(params)[0].style.setProperty("animation","__");
                document.getElementsByClassName(params)[0].style.setProperty("animation-duration","0.5s");
                document.getElementsByClassName(params)[0].style.setProperty("animation-fill-mode","forwards");
                }
            }
            </script>
    <html>

    <body style="background-image: url(${message}); overflow: hidden;" >

        <img src="Image/icon.png" class="Up1" onmousedown = "f();" onmouseenter = "s('Up1');" onmouseout="sout('Up1');"/>

        <img src="Image/icon.png" class="Up2" onmouseenter = "s('Up2');" onmouseout="sout('Up2');"/>

        <img src="Image/icon.png" class="Up3" onmouseenter = "s('Up3');" onmouseout="sout('Up3');"/>
        <div id="formcreat"></div>

    </body>
    </html>