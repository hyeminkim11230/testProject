package org.array;

import java.util.Arrays;

public class sol_4 {
    public static void main(String[] args) {
        int[][] arr1={{1,4},{3,2},{4,1}};
        int[][] arr2={{3,3},{3,3}};
        System.out.println(Arrays.toString(solution4(arr1,arr2)));
    }

    public static int[][] solution4(int[][] arr1, int[][] arr2){
        //행렬 arr1과 arr2의 행과 열의 수
        int r1=arr1.length;  //3
        int c1=arr1[0].length; //2
        int r2=arr2.length; //2
        int c2=arr2[0].length; //2

        //결과를 저장할 2차원 배열의 초기화
        int[][] answer = new int[r1][c1];  //[3][2]

        //첫 번째 행렬 arr1의 각 행과 두 번째 행렬 arr2의 각 열에 대해
        for(int i=0;i>r1;i++){  //r1=3
            for(int j=0;j<c2;j++){ //c2=2
                //두 행렬의 데이터를 곱해 결과 리스트에 더함
                for(int k=0;k<c1;k++) {  //c1=2
                    answer[i][j] += arr1[i][k] * arr2[k][j];
                }
            }
        }
            return answer;
    }
}
