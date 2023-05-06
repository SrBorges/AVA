package com.company.calc_project;

import javafx.fxml.FXML;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.control.TextField;

public class ViewController {

    @FXML
    protected TextField tf01;

    @FXML
    protected TextField tf02;

    @FXML
    protected TextField tf03;

    @FXML
    protected Button bt01;

    @FXML
    protected Button bt02;

    @FXML
    protected Button bt03;

    @FXML
    protected Button bt04;

    @FXML
    protected Label lb01;

    @FXML
    protected Label lb02;

    @FXML
    protected Label lb03;

    @FXML
    protected Label lb04;

    @FXML
    protected Label lb05;

    @FXML
    protected Label lb06;

    public void calcularVc(){

        double va = Double.parseDouble(tf02.getText());

        double cr = Double.parseDouble(tf03.getText());

        double vc = va - cr;

        lb01.setText(String.format("%.2f", vc));

    }

    public void calcularVp(){

        double va = Double.parseDouble(tf02.getText());

        double vpl = Double.parseDouble(tf01.getText());

        double vp = va - vpl;

        lb02.setText(String.format("%.2f", vp));

    }

    public void acharIdp(){

        double va = Double.parseDouble(tf02.getText());

        double vpl = Double.parseDouble(tf01.getText());

        double idp = va / vpl;

        lb03.setText(String.format("%.2f", idp));

        if(idp > 1){
            lb05.setText("Favoravel. ");
        }else if(idp == 1){
            lb05.setText("No Prazo. ");
        }else{
            lb05.setText("Desfavoravel. ");
        }


    }


    public void acharIdc(){

        double va = Double.parseDouble(tf02.getText());

        double cr = Double.parseDouble(tf03.getText());

        double idc = va / cr;

        lb04.setText(String.format("%.2f", idc));

        if(idc > 1){
            lb06.setText("Favoravel. ");
        }else if(idc == 1){
            lb06.setText("No Prazo. ");

        }else{
            lb06.setText("Desfavoravel. ");
        }
    }



}

