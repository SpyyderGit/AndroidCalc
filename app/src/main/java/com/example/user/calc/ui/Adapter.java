package com.example.user.calc.ui;

/**
 * Created by User on 07.10.2016.
 */
public class Adapter {

    int result(int x, int y, char op) {
        int res = 0;
        switch (op) {
            case '+':
                res = x + y;
                break;
            case '-':
                res = x - y;
                break;
            case '*':
                res = x * y;
                break;
            case '/':
                res = x / y;
                break;
            default:
                res = 0;
        }
        return res;
    }
}
