
/*
* @author Sandeep Kolli
*/

public class CardMenu{
    public static void main(String[] args) {
     CardCatalog NewCard = new CardCatalog();
     NewCard.AddCard(new Card("The Lord of the Rings","J.R.R.Tolkien","Fantasy"));
     NewCard.AddCard(new Card("The Alchemist","Paulo Coelho","Fantasy"));
     NewCard.AddCard(new Card("Harry Potter and the Philosopher's Stone","J.K.Rowling","Fantasy"));
     NewCard.AddCard(new Card("Think and Grow Rich","Napoleon Hill","Self help"));
     NewCard.AddCard(new Card("You Can Heal Your Life","Louise Hay","Self help"));
     NewCard.AddCard(new Card("Black Beauty","Anna Sewell","Children literature"));
     NewCard.AddCard(new Card("Heidi","Johanna Spyri","Children Fiction"));
     NewCard.AddCard(new Card("Harry Potter and the Order of the Phoenix","J.K.Rowling","Fantasy"));
     NewCard.AddCard(new Card("The Da Vinci Code","Dan Brown","Mystery"));
     NewCard.AddCard(new Card("War and Peace","Leo Tolstoy","Literature"));
     NewCard.AddCard(new Card("Harry Potter and the Chamber of Secrets","J.K.Rowling","Fantasy"));
     NewCard.AddCard(new Card("The Hobbit","J.R.R.Tolkien","Fantasy"));
     NewCard.AddCard(new Card("And Then There Were None","Agatha Christie","Mystery"));
     NewCard.AddCard(new Card("Angels and Demons","Dan Brown","Mystery"));
     NewCard.AddCard(new Card("Who Moved My Cheese","Spencer Johnson","Self help"));
     
     NewCard.removeATitle("Harry Potter and the Order of the Phoenix");
     
     System.out.println();
     System.out.println();
     NewCard.PrintCatalog();
     System.out.println();
     System.out.println();



     String [] sample1 = NewCard.getAuthor("J.K.Rowling");
     for(int i=0; i<sample1.length; i++){
        System.out.print(sample1[i]+" | ");
     }
     System.out.println();
     System.out.println();
     System.out.println();

     String [] sample = NewCard.getSubject("Fanta");
     for(int i=0; i<sample.length; i++){
        System.out.print(sample[i]+" | ");
     }
     System.out.println();
     System.out.println();
     System.out.println();

     Card sample2=NewCard.getTitle("The Alchemist");
     System.out.println("The Details of the book for the title 'The Alchemist' is: ");
     System.out.print("Title: "+sample2.title+" | "+"Author: " +sample2.author+" | "+"Subject: " +sample2.subject);

     System.out.println();
     System.out.println();

    }
}