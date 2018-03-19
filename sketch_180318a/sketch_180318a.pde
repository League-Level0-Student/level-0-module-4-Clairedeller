void setup() {size(800,600);
}
void draw(){background(255,255,255);ellipse(20,30,50,40); ellipse(70,30,50,40);
if (mouseX<45 && mouseY<50){
ellipse(mouseX,mouseY,10,10);
ellipse(mouseX+50,mouseY,10,10);
}
if (mouseX>45){
  ellipse(45,mouseY,10,10);
  ellipse(45+50,mouseY,10,10);
  

}
if (mouseY>50){
ellipse(mouseX,50,10,10);
ellipse(mouseX+50,50,10,10);
}

}