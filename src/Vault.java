import java.util.Random;

public class Vault {
	int i;
	Random ran = new Random();
public Vault() {
	i = ran.nextInt(1000000);
}

public boolean tryCode(int J) {
	if (i == J) {
		return true;
	}
	else {
		return false;
	}
}
}
