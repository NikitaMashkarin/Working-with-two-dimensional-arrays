import java.util.Scanner;

public class LogicProgram {

    public int[][] fillSudent() {
        Scanner scanner = new Scanner(System.in);
        int [] [] student = new int[5] [4];
        for (int i = 0; i < 5; i++){
            for(int j = 0; j < 4; j++){
                switch(j){
                    case 0:
                        student[i][j] = i + 1;
                        break;
                    case 1:
                        System.out.println("Введите рост");
                        student[i][j] = scanner.nextInt();
                        break;
                    case 2:
                        System.out.println("Введите вес");
                        student[i][j] = scanner.nextInt();
                        break;
                    case 3:
                        System.out.println("Введите оценку");
                        student[i][j] = scanner.nextInt();
                        break;
                }
            }
        }
        return student;
    }

    public void printStudent(int[][] student){
        for (int i = 0; i < 5; i++){
            for(int j = 0; j < 4; j++){
                switch(j){
                    case 0:
                        System.out.println("Индификатор ученика: " + student[i][j]);
                        break;
                    case 1:
                        System.out.println("Рост: " + student[i][j]);
                        break;
                    case 2:
                        System.out.println("Вес: "+ student[i][j]);
                        break;
                    case 3:
                        System.out.println("Оценка: " + student[i][j]);
                        break;
                }
            }
        }
    }

    public void printMidValue(int[][] student){
        System.out.println("Седний рост: " + midHeight(student));
        System.out.println("Седний вес: " + midWeight(student));
        System.out.println("Седняя оценка: " + midScore(student));
    }

    public void printUniqueValue(int[][] student){
        int[] idUniqueHeight = uniqueHeight(student);
        System.out.println("Уникальный рост у учиников с id:");
        for (int i = 0; i < idUniqueHeight.length; i++){
            System.out.println(idUniqueHeight[i]);
        }

        int[] idUniqueWeight = uniqueWeight(student);
        System.out.println("Уникальный вес у учиников с id:");
        for (int i = 0; i < idUniqueWeight.length; i++){
            System.out.println(idUniqueWeight[i]);
        }

        int[] idUniqueScore = uniqueScore(student);
        System.out.println("Уникальная оценка у учиников с id:");
        for (int i = 0; i < idUniqueScore.length; i++){
            System.out.println(idUniqueScore[i]);
        }
    }


    private int[] uniqueHeight(int[][] student){
        int[] idUniqueHeight = new int[2];
        int maxHeight = student[1][0];
        int minHeight = student[1][0];
        for (int i = 0; i < 5; i++){
            for(int j = 0; j < 4; j++){
                if(i == 1){
                    if(maxHeight < student[i][j]){
                        maxHeight = student[i][j];
                        idUniqueHeight[0] = j;
                    } else if (minHeight > student[i][j]){
                        minHeight = student[i][j];
                        idUniqueHeight[1] = j;
                    }
                }
            }
        }
        return idUniqueHeight;
    }

    private int[] uniqueWeight(int[][] student){
        int[] idUniqueWeight = new int[2];
        int maxWeight = student[2][0];
        int minWeight = student[2][0];
        for (int i = 0; i < 5; i++){
            for(int j = 0; j < 4; j++){
                if(i == 2){
                    if(maxWeight < student[i][j]){
                        maxWeight = student[i][j];
                        idUniqueWeight[0] = j;
                    } else if (minWeight > student[i][j]){
                        minWeight = student[i][j];
                        idUniqueWeight[1] = j;
                    }
                }
            }
        }
        return idUniqueWeight;
    }

    private int[] uniqueScore(int[][] student){
        int[] idUniqueScore = new int[2];
        int maxScore = student[3][0];
        int minScore = student[3][0];
        for (int i = 0; i < 5; i++){
            for(int j = 0; j < 4; j++){
                if(i == 3){
                    if(maxScore < student[i][j]){
                        maxScore = student[i][j];
                        idUniqueScore[0] = j;
                    } else if (minScore > student[i][j]){
                        minScore = student[i][j];
                        idUniqueScore[1] = j;
                    }
                }
            }
        }
        return idUniqueScore;
    }

    private double midHeight(int[][]student){
        double sumHeight = 0;
        for (int i = 0; i < 5; i++){
            for(int j = 0; j < 4; j++){
                if(j == 1){
                    sumHeight += student[i][j];
                }
            }
        }
        double midHeight = sumHeight / 5;
        return midHeight;
    }

    private double midWeight(int[][]student){
        double sumWeight = 0;
        for (int i = 0; i < 5; i++){
            for(int j = 0; j < 4; j++){
                if(j == 2){
                    sumWeight += student[i][j];
                }
            }
        }
        double midWeight = sumWeight / 5;
        return midWeight;
    }

    private double midScore(int[][]student){
        double sumScore = 0;
        for (int i = 0; i < 5; i++){
            for(int j = 0; j < 4; j++){
                if(j == 3){
                    sumScore += student[i][j];
                }
            }
        }
        double midScore = sumScore / 5;
        return midScore;
    }
}
