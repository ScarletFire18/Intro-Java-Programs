public class Essay extends GradedActivity 
{

   private double grammar;
   private double spelling;
   private double correctLength;
   private double content;
   private double score;
   
   /*
   *
   */
   public Essay() {
      grammar = 0.0;
      spelling = 0.0;
      correctLength = 0.0;
      content = 0.0;
   }
   
   
   /*
   *
   */
   public Essay(double grammar, double spelling, double correctLength, double content) {
      setGrammar(grammar);
      setSpelling(spelling);
      setCorrectLength(correctLength);
      setContent(content);
      
      
   }
   
   /*
   *
   */
   public void setGrammar(double grammar) {
      this.grammar = grammar;
   }
   
   /*
   *
   */
   public double getGrammar() {
      return grammar;
   }
   
  /*
   *
   */
   public void setSpelling(double spelling) {
      this.spelling = spelling;
   }
   
   /*
   *
   */ 
   public double getSpelling() {
      return spelling;
   }
   
   /*
   *
   */
   public void setCorrectLength(double correctLength) {
      this.correctLength = correctLength;
   }
   
   /*
   *
   */
   public double getCorrectLength() {
      return correctLength;
   }
   
   /*
   *
   */
   public void setContent(double content) {
      this.content = content;
   }
   
   /*
   *
   */ 
   public double getContent() {
      return content;
   }
}