import java.util.Date;
class Account {
	private int id = 0;		//表示账号
	private double balance = 0;		//余额显示
	private double annualInterestRate = 0;	//年利率
	private Date dateCreated = new Date();

	private double monthlyInterest ;
	private double monthlyInterestRate ;

	//主函数
	public static void main(String[] args){
		Account account = new Account(1122,20000);
		System.out.println("=== 您的账户名称是："+account.getId()+" || 您的账户余额是："+account.getBalance()+" ===");
		//System.out.println("您的账户余额是："+account.getBalance());
		account.withDraw(2500);
		account.deposit(3000);
	}

	public Account(){
	};
	public Account(int newId, double newBalance){
		id = newId;
		balance = newBalance;
	}
	//id访问器
	public int getId(){
		return id;
	}
	//id修改器
	public void setId(int newId){
		id = (newId !=0) ? newId : 0;
	}
	//balance访问器
	public double getBalance(){
		return balance;
	}
	//balance修改器
	public void setBalance(double newbalance){
		balance = (newbalance !=0)? newbalance : 0;
	}
	//annualInterstRate访问器
	public double annualInterestRate(){
		return annualInterestRate;
	}
	//annualInterstRate修改器
	public void setAnnualInterestRate(double newAnnualInterestRate){
		annualInterestRate = (newAnnualInterestRate !=0)? newAnnualInterestRate : 0;
	}
	//dateCreated访问器
	public java.util.Date dateCreated(){
		return dateCreated;
	}
	//getMonthlyInterestRate()方法，返回月利率
	public double getMonthlyInterestRate(){
		monthlyInterestRate = annualInterestRate/12;
		return monthlyInterestRate;
	}

	//getMonthlyInterest()方法，返回月利息
	public double getMonthlyInterest(){
		monthlyInterest = balance * monthlyInterestRate;
		return monthlyInterest;
	}

	//withDraw方法，从账户提取指定额度
	public void withDraw(double outmoney){
		balance -= outmoney;
		System.out.println("--- 您取出了:"+outmoney+" || 您现在的账户余额是:" + balance+" ---");
	}

	//deposit方法，向账户存储指定额度
	public void deposit(double inmoney){
		balance += inmoney;
		System.out.println("--- 您取出了:"+inmoney+" || 您现在的账户余额是:" + balance+" ---");
	}

}