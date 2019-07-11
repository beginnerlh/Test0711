
/*
输入球的中心点和球上某一点的坐标，计算球的半径和体积

输入描述:
球的中心点和球上某一点的坐标，以如下形式输入：x0 y0 z0 x1 y1 z1


输出描述:
输入可能有多组，对于每组输入，输出球的半径和体积，并且结果保留三位小数

为避免精度问题，PI值请使用arccos(-1)。
示例1
输入
0 0 0 1 1 1
输出
1.732 21.766
*/
package written_test0711;

import java.util.*;
//球的半径和体积
public class Test2{
    public static void main(String[] args){
        Scanner in = new Scanner(System.in);
        while(in.hasNext()){
            int x0 = in.nextInt();
            int y0 = in.nextInt();
            int z0 = in.nextInt();
            int x1 = in.nextInt();
            int y1 = in.nextInt();
            int z1 = in.nextInt();
            double r = Math.sqrt(Math.pow((x1-x0),2)+
                    Math.pow((y1-y0),2)+
                    Math.pow((z1-z0),2));
            System.out.printf("%.3f",r);
            System.out.print(" ");
            System.out.printf("%.3f\n",Math.pow(r,3)*4*Math.acos(-1)/3);
        }
    }
}
