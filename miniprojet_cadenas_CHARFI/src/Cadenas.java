/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
/**
 *
 * @author Alexander
 */
public class Cadenas {
    int case1;
    int case2;
    int case3; 
    int case4;   
public Cadenas(int case1, int case2, int case3, int case4) {
    this.case1 = case1;
    this.case2 = case2;
    this.case3 = case3;
    this.case4 = case4;
}
public int getVal_case1() {
    return case1;
}
public int upVal_case1() {
    case1 = (case1 + 1) % 10;
    return case1;
}
public int downVal_case1() {
    case1 = (case1 + 9) % 10;
    return case1;
}
public int getVal_case2() {
    return case2;
}
public int upVal_case2() {
    case2 = (case2 + 1) % 10;
    return case2;
}
public int downVal_case2() {
    case2 = (case2 + 9) % 10;
    return case2;
}
public int getVal_case3() {
    return case3;
}
public int upVal_case3() {
    case3 = (case3 + 1) % 10;
    return case3;
}
public int downVal_case3() {
    case3 = (case3 + 9) % 10;
    return case3;
}
public int getVal_case4() {
    return case4;
}
public int upVal_case4() {
    case4 = (case4 + 1) % 10;
    return case4;
}
public int downVal_case4() {
    case4 = (case4 + 9) % 10;
    return case4;
}
}
