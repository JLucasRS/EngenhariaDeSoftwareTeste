import java.util.ArrayList;

public class Valores implements ValoresITF{
	
	private ArrayList<Integer> valores = new ArrayList<Integer>();
	
	public boolean inserir(int v){
		if (size() < 10 && v > 0){
			valores.add(v);
			return true;
		}else{
			return false;
		}
	}
	
	public int apagar(int i){
		if(valores.isEmpty()){
			return -1;
		}else{
			int retorno = valores.get(i);
			valores.remove(i);
			return retorno;
		}
	}
	
	public int size(){
		return valores.size();
	}
	
	public double media(){
		int media = 0;
		if (!valores.isEmpty()){
			for (int i = 0; i < size(); i++){
				media += valores.get(i);
			}
			return (double)media / size();
		}else{
			return 0;
		}
	}
	
	public int bigger(){
		if (!valores.isEmpty()){
			int maior = 0;
			for (int i = 0; i < size(); i++){
				if (valores.get(i) > maior){
					maior = valores.get(i);
				}
			}
			return maior;
		}else{
			return -1;
		}
	}
	
	public int lower(){
		if (!valores.isEmpty()){
			int menor = bigger();
			for (int i = 0; i < size(); i++){
				if (valores.get(i) < menor){
					menor = valores.get(i);
				}
			}
			return menor;
		}else{
			return -1;
		}
	}
	
}
