
/*
�������������:

    ? It is certain (���������)
    ? It is decidedly so (����������)
    ? Without a doubt (������� ��������)
    ? Yes � definitely (���������� ��)
    ? You may rely on it (������ ���� ������ � ����)

������������ �������������

    ? As I see it, yes (��� ������� � ���)
    ? Most likely (��������� �����)
    ? Outlook good (������� �����������)
    ? Signs point to yes (����� ������� � ���)
    ? Yes (��)

�����������

    ? Reply hazy, try again (���� �� ����, �������� �����)
    ? Ask again later (������ �����)
    ? Better not tell you now (����� �� ������������)
    ? Cannot predict now (������ ������ �����������)
    ? Concentrate and ask again (��������������� � ������ �����)

�������������

    ? Don�t count on it (���� �� �����)
    ? My reply is no (��� ����� � ����)
    ? My sources say no (�� ���� ������ � ����)
    ? Outlook not so good (����������� �� ����� �������)
    ? Very doubtful (������ �����������) 

 */
public class Display {
	
	String[] ansver;
	
	public Display(){
		ansver = new String[20];
		//positive ansver
		ansver[0] = "It is certain (���������)";
		ansver[1] = "It is decidedly so (����������)";
		ansver[2] = "Without a doubt (������� ��������)";
		ansver[3] = "Yes � definitely (���������� ��)";
		ansver[4] = "You may rely on it (������ ���� ������ � ����)";
		//maybe positive ansver
		ansver[5] = "As I see it, yes (��� ������� � ���)";
		ansver[6] = "Most likely (��������� �����)";
		ansver[7] = "Outlook good (������� �����������)";
		ansver[8] = "Signs point to yes (����� ������� � ���)";
		ansver[9] = "Yes (��)";
		// neutral
		ansver[10] = "Reply hazy, try again (���� �� ����, �������� �����)";
		ansver[11] = "Ask again later (������ �����)";
		ansver[12] = "Better not tell you now (����� �� ������������)";
		ansver[13] = "Cannot predict now (������ ������ �����������)";
		ansver[14] = "Concentrate and ask again (��������������� � ������ �����)";
		// negative
		ansver[15] = "Don�t count on it (���� �� �����)";
		ansver[16] = " My reply is no (��� ����� � ����)";
		ansver[17] = "My sources say no (�� ���� ������ � ����)";
		ansver[18] = "Outlook not so good (����������� �� ����� �������)";
		ansver[19] = "Very doubtful (������ �����������) ";
				
	}
	public void getAnsver(){
		int rand = (int) (Math.random()*20);
		String Ansver = ansver[rand];
		System.out.println(Ansver);
	}
}
