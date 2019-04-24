package class3.chapter1.code14;

public class BackupA extends Thread{
	
	private DBTools dbtools;
	
	public BackupA(DBTools dbtools){
		super();
		this.dbtools = dbtools;
	}
	
	@Override
	public void run() {
		dbtools.backupA();
	}
}
