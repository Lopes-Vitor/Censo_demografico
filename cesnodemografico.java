package censodemografico;
import java.util.Scanner;
public class censo {

	public static void main(String[] args) {
			Scanner leitor = new Scanner(System.in);

			//declarando as variaveis
	        double alturam=0,alturah=0, soma=0, medialturam=0, mediaidadeh=0,total=0, percentual=0, alturaoutros=0,idadeh=0,idadem=0, outros=0, numb=0, genero, homem=0, idadeoutros=0, idade=0, mulher=0, percentualh = 0, percentualm=0, percentualoutros=0, mediaidadem=0,mediaidadeoutros=0;
	        
	       
	        //utilizando o FOR para rodar o codigo para cada um dos 1000 habitantes
	        for(int i=0; i < 1000; i++) {
	        //perguntando o genero da pessoa
	        System.out.println("qual o seu genero: \r\n(0) - feminino \r\n(1) - masculino \r\n(2) - outros");
	        //recebendo a resposta em uma variavel
	        genero = leitor.nextInt();

	        //utilizando o If/else if para ver qual genero a pessoa escolheu e perguntar a idade e a altura do genero escolhido
	        if (genero == 0) {
	            System.out.println("Digite a idade da mulher: ");
	            idadem = leitor.nextInt();
	            System.out.println("Digite a altura da mulher: ");
	            alturam = leitor.nextDouble();
	            //guardando em uma variavel todas as idades somadas
	            mediaidadem = mediaidadem+ idadem;
	            //guardando em uma variavel todas as alturas somadas
	            medialturam = medialturam + alturam;
	            //contador para ter a quantidade de mulheres
	            mulher = mulher + 1;
	            }
	        else if (genero == 1) {
	            System.out.println("Digite a idade do homem: ");
	            idadeh = leitor.nextInt();
	            System.out.println("Digite a altura do homem: ");
	            alturah = leitor.nextDouble();
	            //guardando em uma variavel todas as idades somadas
	            mediaidadeh = mediaidadeh+ idadeh;
	            //contador para ter a quantidade de homens
	            homem = homem + 1;
	            }
	         else if (genero == 2) {
	        	System.out.println("Digite a idade de outros: ");
	        	idadeoutros = leitor.nextInt();
	        	System.out.println("Digite a altura de outros: ");
	        	alturaoutros = leitor.nextDouble();
	        	//guardando em uma variavel todas as idades somadas
	        	mediaidadeoutros = mediaidadeoutros+ idadeoutros;
	        	//contador para ter a quantidade de
	        	outros = outros + 1;
	        }
	        //utilizando o If/Else if para ver se a idade dos homens, mulheres e outros é maior/igual a 18 ou menor/igual a 35
	        if (idadeh >= 18 && idadeh <= 35) {	
	        //contador para ter o percentual de homens entre 18 e 35 anos
	        percentualh = percentualh + 1;
	        }
	        else if (idadem >= 18 && idadem <= 35) {	
	        	//contador para ter o percentual de mulheres entre 18 e 35 anos
	            percentualm = percentualm + 1;
	            }
	        else if (idadeoutros >= 18 && idadeoutros <= 35) {	
	        	//contador para ter o percentual de outros entre 18 e 35 anos
	            percentualoutros = percentualoutros + 1;
	            }
	        //fazendo uma soma para ter o total de pessoas de cada genero
	        total = (homem + mulher) + outros;
	        //Somando o percentual de todos os generos 
	        percentual = percentualh + percentualm + percentualoutros;
	        //Somando para ter o total de todas as medias de idade
	        soma = mediaidadeh + mediaidadem + mediaidadeoutros;
	        }
	        //Printando os resultados da media da idade do grupo, da altura das mulheres, da idade dos homens, da quantidade de pessoas que se identificam como outros e o percentual de pessoas entre 18 e 35 anos
	        System.out.println("Média da idade do grupo " + (soma/total));
	        System.out.println("Média da altura das mulheres " + (medialturam/mulher));
	        System.out.println("Média da idade dos homens " + (mediaidadeh/homem));
	        System.out.println("quantidade de pessoa que se identificam como (outros) " + (outros));
	        System.out.println("Percentual de pessoas com idade entre 18-35 anos: " + (percentual/100)+"%");
	}

	}