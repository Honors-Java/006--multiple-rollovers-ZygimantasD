void setup() {
	size(400, 400);
}

void draw() {
	background(255);
	stroke(0);
	fill(0);

//start creating the lines

	// horizontal lines
	line(0, 0, 399, 0);
	line(0, 399, 399, 399);

	// vertical lines
	line(0, 0, 0, 399);
	line(399, 0, 399, 399);

	//intersection
	line(200, 0, 200, 399);
	line(0, 200, 399, 200);

	println(mouseX, mouseY);

//Build your conditional statement 
	
	if(mouseX < 200 && mouseY <= 200) {
		rect(0, 0, 200, 200);
	}else if(mouseX >= 200 && mouseY <= 200) {
		rect(200, 0, 200, 200);
	}else if(mouseX < 200 && mouseY > 200) {
		rect(0, 200, 200, 200);
	}else {
		rect(200, 200, 200, 200);
	}

}