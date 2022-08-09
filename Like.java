class Solution {
    public static String whoLikesIt(String... names) {
        String answer;
        System.out.println(names.length);
        switch (names.length){
            case 0:
                answer = "no one likes this";
                break;
            case 1:
                answer = String.format("%s likes this",names[0]);
                break;
            case 2:
                answer = String.format("%s and %s like this",names[0], names[1]);
                break;
            case 3:
                answer = String.format("%s, %s and %s like this",names[0], names[1],names[2]);
                break;
            default:
                answer = String.format("%s, %s and %d other like this",names[0], names[1],names.length-2);
                break;
        }

        return answer;
    }
    public static void main(String[] args) {
        System.out.println(whoLikesIt("Peter","Griffin","Sam"));

    }
}