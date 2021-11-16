package com.example.intent.Model;

public class Model {

    public String hitung(double beratBadan, double tinggiBadan) {

        String inputData;

        double rumusBMI = beratBadan / (tinggiBadan * tinggiBadan);
        if (rumusBMI < 18.5) {

            inputData = "Anda kekurangan berat badan.";
        } else if (rumusBMI >= 18.5 && rumusBMI <= 24.9) {
            inputData = "Berat badan anda normal (ideal).";
        } else if (rumusBMI >= 25 && rumusBMI <= 29.9) {
            inputData = "Anda kelebihan berat badan.";
        } else {
            inputData = "Anda kegemukan (obesitas).";
        }

        return inputData;

    }
}
