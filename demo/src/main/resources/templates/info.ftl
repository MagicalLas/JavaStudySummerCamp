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
      0%    {top: 150%;}
      
      100%{top: 80%;}
    }


    </style>
    
    <html>
        <body style="background-image: url(${message}); overflow: hidden;" >
            
        <img src="Image/icon.png" class="Up1"/>
    
        <img src="Image/icon.png" class="Up2"/>
    
        <img src="Image/icon.png" class="Up3"/>
    
    </body>
    </html>