<style>
        img {
        max-width: 50%;
        max-height: 50%;
        vertical-align:top;
    }
    
    
    .Up1{
        animation: Up_ 1s forwards;
        animation-delay: 0.5s;
        image-rendering: auto;
        position: absolute;
  right: 73%;
        width: 12%;
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
        width: 12%;
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
        width: 12%;
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
      0%    {transform: rotateZ(0deg);top: 68%;

        transform-origin: 50% 70%;
        width: 12%;
        position: absolute;}

      100%{transform: rotateZ(15deg);
        position: absolute;
        transform-origin: 50% 70%;

        width: 18%;
        top: 68%;}
    }
    @keyframes __ {

      0%{transform: rotateZ(15deg);
        top: 68%;
        width: 18%;
        transform-origin: 50% 70%;
        }
      100%    {transform: rotateZ(0deg);top: 68%;

        transform-origin: 50% 70%;
        width: 12%;}
    }


    .longin{
        animation: login_ 3s forwards;
        width: 40%;
        height: 40%;
        transform-origin: 50% 50%;
        top: 30%;
        left: 30%;
          transform: rotateX(90deg);
        position: absolute;
        background-color: aquamarine;
    }

    @keyframes login_ {
      0%    {
          transform: rotateX(90deg);
      }
      100%{

          transform: rotateX(0deg);
      }
    }
    </style>
    <script>
            function f(){
            document.getElementById("formcreat").innerHTML = "<div class='longin'><form method='POST' action='/post' enctype="multipart/form-data"><input name='name' type='text'/><input class="file" type="file" file-model="myFile" name="myFile"/><input type='submit' value='게시하기'/></form></div>";
            }

            function s(params) {
                if(document.getElementsByClassName(params)[0].style.getPropertyValue("animation-play-state")!="running" && document.getElementsByClassName(params)[0].style.getPropertyValue("animation-name")!="_"){
                document.getElementsByClassName(params)[0].style.setProperty("animation","_");
                document.getElementsByClassName(params)[0].style.setProperty("animation-duration","0.4s");
                document.getElementsByClassName(params)[0].style.setProperty("animation-fill-mode","forwards");
                }
            }
            function sout(params) {
                if(document.getElementsByClassName(params)[0].style.getPropertyValue("animation-play-state")!="running" && document.getElementsByClassName(params)[0].style.getPropertyValue("animation-name")!="__"){
                document.getElementsByClassName(params)[0].style.setProperty("animation","__");
                document.getElementsByClassName(params)[0].style.setProperty("animation-duration","0.4s");
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