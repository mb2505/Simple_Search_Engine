# Simple_Search_Engine
I created a simple search engine which processes some data and searches it for a word or a phrase.

The program reads data from a text file, which is passed with command line.

I am using a data structure called Inverted Index. It maps each word to all positions/lines/documents in which the word occurs. 
As a result, when you enter a query, you can immediately find the answer without any comparisons.

Take, for example, these six sample lines:
Dwight Joseph djo@gmail.com
Rene Webb webb@gmail.com
Katie Jacobs
Erick Harrington harrington@gmail.com
Myrtle Medina
Erick Burgess

You can choose betweeen the searching strategies: ALL, ANY and NONE.

If the strategy is ALL, the program prints lines containing all the words from the query.

Query:
Harrington Erick

Result:
Erick Harrington harrington@gmail.com

If the strategy is ANY, the program prints the lines containing at least one word from the query.

Query:
Erick Dwight webb@gmail.com

Result:
Erick Harrington harrington@gmail.com
Erick Burgess
Dwight Joseph djo@gmail.com
Rene Webb webb@gmail.com

If the strategy is NONE, the program prints lines that do not contain words from the query at all:

Query:
djo@gmail.com ERICK

Result:
Katie Jacobs
Myrtle Medina
Rene Webb webb@gmail.com
