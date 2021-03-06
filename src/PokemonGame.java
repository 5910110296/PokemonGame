import java.util.*;
import java.awt.*;
import java.awt.event.*;
import javax.swing.*;


public class PokemonGame extends JFrame{
        private JLabel lb1;
        private JTextArea ta;
        private JButton bt1;
        private JButton bt2;
        private JButton bt3;
        private JButton bt4;
        private JButton bt5;
        private JPanel pn1,pn2;
        private String ss;
       
        private PokemonGame(){
            
            super("PokemonGame");
            ArrayList<Pokemon> pokemons = new ArrayList<Pokemon>();
		for(int i=0; i<5; ++i){
			pokemons.add(new Pikachu());
		}
                for(int i=0; i<5; ++i){
                        pokemons.add(new Keromatsu());
		}
            lb1 = new JLabel("PokemonInfo...");
            
            ta  = new JTextArea(20,10);
            bt1 = new JButton("Feed");
            bt2 = new JButton("Exercise");
            bt3 = new JButton("Attack");
            bt4 = new JButton("Add New Pikachu");
            bt5 = new JButton("Add New Keromatsu");
            ta.append("===== Pokemon List =====\n");
            ta.append(printPokemons(pokemons)+"\n");
            bt1.addActionListener(new ActionListener()
		{
			public void actionPerformed(ActionEvent e)
			{
                            ta.append("\n\nPokemon Eat ... \nPokemon List After Ate ... \n===== Pokemon List =====\n" );
                            Berry berry = new Berry(0);
                            for(Pokemon pokemon: pokemons)
                            pokemon.eat(berry);
                            ta.append(printPokemons(pokemons)+"\n");
                            
                            
                            
                        }});
            bt2.addActionListener(new ActionListener()
		{
			public void actionPerformed(ActionEvent e)
			{
                            ta.append("\n\nPokemon Exercies ...\nPokemon List After Exercies ... \n===== Pokemon List =====\n");
                            for(Pokemon pokemon: pokemons)
                                pokemon.move();
                            ta.append(printPokemons(pokemons)+"\n");
                          
                        }});
            bt3.addActionListener(new ActionListener()
		{
			public void actionPerformed(ActionEvent e)
			{
                            ta.append("\n\nPokemon Battle ...\nPokemon List After Attack ... \n===== Pokemon List =====\n");
                            Pokemon pokemon1 = pokemons.get(0);
                            Pokemon pokemon2 = pokemons.get(1);
                            pokemon1.attack(pokemon2);
                            ta.append(printPokemons(pokemons)+"\n");
                            
                        }});
            bt4.addActionListener(new ActionListener()
		{
			public void actionPerformed(ActionEvent e)
			{
                            ta.append("\n\nAdd New Pikachu ...\nPokemon List After Add ... \n===== Pokemon List =====\n");
                            pokemons.add(new Pikachu()); 
                            ta.append(printPokemons(pokemons)+"\n");
                            
                        }});
            bt5.addActionListener(new ActionListener()
		{
			public void actionPerformed(ActionEvent e)
			{
                            ta.append("\n\nAdd New Keromatsu ...\nPokemon List After Add ... \n===== Pokemon List =====\n");
                            pokemons.add(new Keromatsu());
                            ta.append(printPokemons(pokemons)+"\n");
                            
                        }});
            pn1 = new JPanel();
            pn2 = new JPanel();
            
            pn1.setLayout(new FlowLayout(FlowLayout.LEFT,2,5));
            pn2.setLayout(new FlowLayout(FlowLayout.RIGHT,2,5));
            pn2.setLayout(new GridLayout(5,1));
            pn1.add(lb1);
            pn2.add(bt1);
            pn2.add(bt2);
            pn2.add(bt3);
            pn2.add(bt4);
            pn2.add(bt5);
           
            Container c = getContentPane();

            c.setLayout(new BorderLayout());
            c.add(pn1,BorderLayout.NORTH);
            c.add(pn2,BorderLayout.EAST);
            c.add(ta,BorderLayout.CENTER);
            

            this.setSize(850,500);
            this.setLocationRelativeTo(null);
            this.setDefaultCloseOperation(this.EXIT_ON_CLOSE);
            this.setVisible(true);
            
        }
        
	public String printPokemons(ArrayList<Pokemon> pokemons){
                String s = "";
                String all = "";
		for(Pokemon pokemon: pokemons){
                    s = "Pokemon "+pokemon.getName()+" health: "+pokemon.getHealth()+"/"+pokemon.maxHealth;
                    all += s;
                    all += "\n";
                }
                return all;
	}

	public static void main(String args[]){
            PokemonGame frame = new PokemonGame();
	}
}
