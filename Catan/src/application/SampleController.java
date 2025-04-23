package application;

import java.io.*;
import java.util.*;

import javafx.fxml.FXML;
import javafx.scene.control.Alert;
import javafx.scene.control.Button;
import javafx.scene.control.ButtonType;
import javafx.scene.control.Label;
import javafx.scene.shape.Polygon;
import javafx.scene.paint.Color;

public class SampleController {
	@FXML private Label label_1 = new Label();
	@FXML private Label label_2 = new Label();
	@FXML private Label label_3 = new Label();
	@FXML private Label label_4 = new Label();
	@FXML private Label label_5 = new Label();
	@FXML private Label label_6 = new Label();
	@FXML private Label label_7 = new Label();
	@FXML private Label label_8 = new Label();
	@FXML private Label label_9 = new Label();
	@FXML private Label label_10 = new Label();
	@FXML private Label label_11 = new Label();
	@FXML private Label label_12 = new Label();
	@FXML private Label label_13 = new Label();
	@FXML private Label label_14 = new Label();
	@FXML private Label label_15 = new Label();
	@FXML private Label label_16 = new Label();
	@FXML private Label label_17 = new Label();
	@FXML private Label label_18 = new Label();
	@FXML private Label label_19 = new Label();
	@FXML private Polygon tile1 = new Polygon(-43.0, 25.0, -43.0, -25.0, 0.0, -50.0, 43.0, -25.0, 43.0, 25.0, 0.0, 50.0);
	@FXML private Polygon tile2 = new Polygon(43.0, 25.0, -43.0, -25.0, 0.0, -50.0, 43.0, -25.0, 43.0, 25.0, 0.0, 50.0);
	@FXML private Polygon tile3 = new Polygon(-43.0, 25.0, -43.0, -25.0, 0.0, -50.0, 43.0, -25.0, 43.0, 25.0, 0.0, 50.0);
	@FXML private Polygon tile4 = new Polygon(-43.0, 25.0, -43.0, -25.0, 0.0, -50.0, 43.0, -25.0, 43.0, 25.0, 0.0, 50.0);
	@FXML private Polygon tile5 = new Polygon(-43.0, 25.0, -43.0, -25.0, 0.0, -50.0, 43.0, -25.0, 43.0, 25.0, 0.0, 50.0);
	@FXML private Polygon tile6 = new Polygon(43.0, 25.0, -43.0, -25.0, 0.0, -50.0, 43.0, -25.0, 43.0, 25.0, 0.0, 50.0);
	@FXML private Polygon tile7 = new Polygon(-43.0, 25.0, -43.0, -25.0, 0.0, -50.0, 43.0, -25.0, 43.0, 25.0, 0.0, 50.0);
	@FXML private Polygon tile8 = new Polygon(-43.0, 25.0, -43.0, -25.0, 0.0, -50.0, 43.0, -25.0, 43.0, 25.0, 0.0, 50.0);
	@FXML private Polygon tile9 = new Polygon(-43.0, 25.0, -43.0, -25.0, 0.0, -50.0, 43.0, -25.0, 43.0, 25.0, 0.0, 50.0);
	@FXML private Polygon tile10 = new Polygon(-43.0, 25.0, -43.0, -25.0, 0.0, -50.0, 43.0, -25.0, 43.0, 25.0, 0.0, 50.0);
	@FXML private Polygon tile11 = new Polygon(-43.0, 25.0, -43.0, -25.0, 0.0, -50.0, 43.0, -25.0, 43.0, 25.0, 0.0, 50.0);
	@FXML private Polygon tile12 = new Polygon(-43.0, 25.0, -43.0, -25.0, 0.0, -50.0, 43.0, -25.0, 43.0, 25.0, 0.0, 50.0);
	@FXML private Polygon tile13 = new Polygon(-43.0, 25.0, -43.0, -25.0, 0.0, -50.0, 43.0, -25.0, 43.0, 25.0, 0.0, 50.0);
	@FXML private Polygon tile14 = new Polygon(-43.0, 25.0, -43.0, -25.0, 0.0, -50.0, 43.0, -25.0, 43.0, 25.0, 0.0, 50.0);
	@FXML private Polygon tile15 = new Polygon(-43.0, 25.0, -43.0, -25.0, 0.0, -50.0, 43.0, -25.0, 43.0, 25.0, 0.0, 50.0);
	@FXML private Polygon tile16 = new Polygon(-43.0, 25.0, -43.0, -25.0, 0.0, -50.0, 43.0, -25.0, 43.0, 25.0, 0.0, 50.0);
	@FXML private Polygon tile17 = new Polygon(-43.0, 25.0, -43.0, -25.0, 0.0, -50.0, 43.0, -25.0, 43.0, 25.0, 0.0, 50.0);
	@FXML private Polygon tile18 = new Polygon(-43.0, 25.0, -43.0, -25.0, 0.0, -50.0, 43.0, -25.0, 43.0, 25.0, 0.0, 50.0);
	@FXML private Polygon tile19 = new Polygon(-43.0, 25.0, -43.0, -25.0, 0.0, -50.0, 43.0, -25.0, 43.0, 25.0, 0.0, 50.0);

	private int[] tile_numbers = {0,1,1,1,1,2,2,2,2,3,3,3,3,4,4,4,5,5,5};
	private int[] die_numbers = {2,3,3,4,4,5,5,6,6,8,8,9,9,10,10,11,11,12};
	
	@FXML public void initialize() {
		boolean invalidBoard = true;
		
		while (invalidBoard) {
			label_1.setText("Label");
			label_2.setText("Label");
			label_3.setText("Label");
			label_4.setText("Label");
			label_5.setText("Label");
			label_6.setText("Label");
			label_7.setText("Label");
			label_8.setText("Label");
			label_9.setText("Label");
			label_10.setText("Label");
			label_11.setText("Label");
			label_12.setText("Label");
			label_13.setText("Label");
			label_14.setText("Label");
			label_15.setText("Label");
			label_16.setText("Label");
			label_17.setText("Label");
			label_18.setText("Label");
			label_19.setText("Label");
			//System.out.println("Generating");
			invalidBoard = false;
			
			ArrayList<Integer> temp = new ArrayList<Integer>();
			for (int i = 0; i < tile_numbers.length; i++) {
				temp.add(tile_numbers[i]);
			}
			
			ArrayList<Integer> tile_config = new ArrayList<Integer>();
			while (temp.size() != 0) {
				Random r = new Random();
				int number = r.nextInt(temp.size());
				tile_config.add(temp.get(number));
				temp.remove(number);
			}
			changeColor(tile1, tile_config.get(0), label_1);
			changeColor(tile2, tile_config.get(1), label_2);
			changeColor(tile3, tile_config.get(2), label_3);
			changeColor(tile4, tile_config.get(3), label_4);
			changeColor(tile5, tile_config.get(4), label_5);
			changeColor(tile6, tile_config.get(5), label_6);
			changeColor(tile7, tile_config.get(6), label_7);
			changeColor(tile8, tile_config.get(7), label_8);
			changeColor(tile9, tile_config.get(8), label_9);
			changeColor(tile10, tile_config.get(9), label_10);
			changeColor(tile11, tile_config.get(10), label_11);
			changeColor(tile12, tile_config.get(11), label_12);
			changeColor(tile13, tile_config.get(12), label_13);
			changeColor(tile14, tile_config.get(13), label_14);
			changeColor(tile15, tile_config.get(14), label_15);
			changeColor(tile16, tile_config.get(15), label_16);
			changeColor(tile17, tile_config.get(16), label_17);
			changeColor(tile18, tile_config.get(17), label_18);
			changeColor(tile19, tile_config.get(18), label_19);
			
			for (int i = 0; i < die_numbers.length; i++) {
				temp.add(die_numbers[i]);
			}
			ArrayList<Integer> number_config = new ArrayList<Integer>();
			while (temp.size() != 0) {
				Random r = new Random();
				int number = r.nextInt(temp.size());
				number_config.add(temp.get(number));
				temp.remove(number);
			}
			
			int counter = 0;
			if (label_1.getText() != "Desert") {
				label_1.setText(number_config.get(counter).toString());
				counter++;
			}
			if (label_2.getText() != "Desert") {
				label_2.setText(number_config.get(counter).toString());
				counter++;
			}
			if (label_3.getText() != "Desert") {
				label_3.setText(number_config.get(counter).toString());
				counter++;
			}
			if (label_4.getText() != "Desert") {
				label_4.setText(number_config.get(counter).toString());
				counter++;
			}
			if (label_5.getText() != "Desert") {
				label_5.setText(number_config.get(counter).toString());
				counter++;
			}
			if (label_6.getText() != "Desert") {
				label_6.setText(number_config.get(counter).toString());
				counter++;
			}
			if (label_7.getText() != "Desert") {
				label_7.setText(number_config.get(counter).toString());
				counter++;
			}
			if (label_8.getText() != "Desert") {
				label_8.setText(number_config.get(counter).toString());
				counter++;
			}
			if (label_9.getText() != "Desert") {
				label_9.setText(number_config.get(counter).toString());
				counter++;
			}
			if (label_10.getText() != "Desert") {
				label_10.setText(number_config.get(counter).toString());
				counter++;
			}
			if (label_11.getText() != "Desert") {
				label_11.setText(number_config.get(counter).toString());
				counter++;
			}
			if (label_12.getText() != "Desert") {
				label_12.setText(number_config.get(counter).toString());
				counter++;
			}
			if (label_13.getText() != "Desert") {
				label_13.setText(number_config.get(counter).toString());
				counter++;
			}
			if (label_14.getText() != "Desert") {
				label_14.setText(number_config.get(counter).toString());
				counter++;
			}
			if (label_15.getText() != "Desert") {
				label_15.setText(number_config.get(counter).toString());
				counter++;
			}
			if (label_16.getText() != "Desert") {
				label_16.setText(number_config.get(counter).toString());
				counter++;
			}
			if (label_17.getText() != "Desert") {
				label_17.setText(number_config.get(counter).toString());
				counter++;
			}
			if (label_18.getText() != "Desert") {
				label_18.setText(number_config.get(counter).toString());
				counter++;
			}
			if (label_19.getText() != "Desert") {
				label_19.setText(number_config.get(counter).toString());
				counter++;
			}
			
//			System.out.print("Board: ");
//			System.out.print(label_1.getText() + ", ");
//			System.out.print(label_2.getText() + ", ");
//			System.out.print(label_3.getText() + ", ");
//			System.out.print(label_4.getText() + ", ");
//			System.out.print(label_5.getText() + ", ");
//			System.out.print(label_6.getText() + ", ");
//			System.out.print(label_7.getText() + ", ");
//			System.out.print(label_8.getText() + ", ");
//			System.out.print(label_9.getText() + ", ");
//			System.out.print(label_10.getText() + ", ");
//			System.out.print(label_11.getText() + ", ");
//			System.out.print(label_12.getText() + ", ");
//			System.out.print(label_13.getText() + ", ");
//			System.out.print(label_14.getText() + ", ");
//			System.out.print(label_15.getText() + ", ");
//			System.out.print(label_16.getText() + ", ");
//			System.out.print(label_17.getText() + ", ");
//			System.out.print(label_18.getText() + ", ");
//			System.out.print(label_19.getText() + ", ");
//			System.out.println();

			if (label_1.getText().compareTo(label_2.getText()) == 0 || label_1.getText().compareTo(label_6.getText()) == 0 || label_1.getText().compareTo(label_7.getText()) == 0) {
				invalidBoard = true;
			}
			if (label_2.getText().compareTo(label_3.getText()) == 0 || label_2.getText().compareTo(label_5.getText()) == 0 || label_2.getText().compareTo(label_6.getText()) == 0) {
				invalidBoard = true;
			}
			if (label_3.getText().compareTo(label_4.getText()) == 0 || label_3.getText().compareTo(label_5.getText()) == 0) {
				invalidBoard = true;
			}
			if (label_4.getText().compareTo(label_5.getText()) == 0 || label_4.getText().compareTo(label_11.getText()) == 0 || label_4.getText().compareTo(label_12.getText()) == 0) {
				invalidBoard = true;
			}
			if (label_5.getText().compareTo(label_6.getText()) == 0 || label_5.getText().compareTo(label_10.getText()) == 0 || label_5.getText().compareTo(label_11.getText()) == 0) {
				invalidBoard = true;
			}
			if (label_6.getText().compareTo(label_7.getText()) == 0 || label_6.getText().compareTo(label_9.getText()) == 0 || label_6.getText().compareTo(label_10.getText()) == 0) {
				invalidBoard = true;
			}
			if (label_7.getText().compareTo(label_8.getText()) == 0 || label_7.getText().compareTo(label_9.getText()) == 0) {
				invalidBoard = true;
			}
			if (label_8.getText().compareTo(label_9.getText()) == 0 || label_8.getText().compareTo(label_16.getText()) == 0) {
				invalidBoard = true;
			}
			if (label_9.getText().compareTo(label_10.getText()) == 0 || label_9.getText().compareTo(label_15.getText()) == 0 || label_9.getText().compareTo(label_16.getText()) == 0) {
				invalidBoard = true;
			}
			if (label_10.getText().compareTo(label_11.getText()) == 0 || label_10.getText().compareTo(label_14.getText()) == 0 || label_10.getText().compareTo(label_15.getText()) == 0) {
				invalidBoard = true;
			}
			if (label_11.getText().compareTo(label_12.getText()) == 0 || label_11.getText().compareTo(label_13.getText()) == 0 || label_11.getText().compareTo(label_14.getText()) == 0) {
				invalidBoard = true;
			}
			if (label_12.getText().compareTo(label_13.getText()) == 0) {
				invalidBoard = true;
			}
			if (label_13.getText().compareTo(label_14.getText()) == 0 || label_13.getText().compareTo(label_19.getText()) == 0) {
				invalidBoard = true;
			}
			if (label_14.getText().compareTo(label_15.getText()) == 0 || label_14.getText().compareTo(label_18.getText()) == 0 || label_14.getText().compareTo(label_19.getText()) == 0) {
				invalidBoard = true;
			}
			if (label_15.getText().compareTo(label_16.getText()) == 0 || label_15.getText().compareTo(label_17.getText()) == 0 || label_15.getText().compareTo(label_18.getText()) == 0) {
				invalidBoard = true;
			}
			if (label_16.getText().compareTo(label_17.getText()) == 0) {
				invalidBoard = true;
			}
			if (label_17.getText().compareTo(label_18.getText()) == 0 || label_18.getText().compareTo(label_19.getText()) == 0) {
				invalidBoard = true;
			}
			number_config.clear();
			tile_config.clear();
		}
	}
	
	public void changeColor(Polygon p, int i, Label L) {
		if (i == 1) {
			p.setFill(Color.rgb(21,151,55,1)); //wood
		} else if (i == 2) {
			p.setFill(Color.rgb(246,189,40,1)); //wheat
		} else if (i == 3) {
			p.setFill(Color.rgb(144,182,11,1)); //sheep
		} else if (i == 4) {
			p.setFill(Color.rgb(226,100,41,1)); //brick
		} else if (i == 5) {
			p.setFill(Color.rgb(161,167,165,1)); //ore
		} else {
			p.setFill(Color.rgb(216,206,145,1)); //desert
			L.setText("Desert");
		}
	}
}
