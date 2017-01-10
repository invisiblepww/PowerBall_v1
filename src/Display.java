
/*
Положительные:

    ? It is certain (Бесспорно)
    ? It is decidedly so (Предрешено)
    ? Without a doubt (Никаких сомнений)
    ? Yes — definitely (Определённо да)
    ? You may rely on it (Можешь быть уверен в этом)

Нерешительно положительные

    ? As I see it, yes (Мне кажется — «да»)
    ? Most likely (Вероятнее всего)
    ? Outlook good (Хорошие перспективы)
    ? Signs point to yes (Знаки говорят — «да»)
    ? Yes (Да)

Нейтральные

    ? Reply hazy, try again (Пока не ясно, попробуй снова)
    ? Ask again later (Спроси позже)
    ? Better not tell you now (Лучше не рассказывать)
    ? Cannot predict now (Сейчас нельзя предсказать)
    ? Concentrate and ask again (Сконцентрируйся и спроси опять)

Отрицательные

    ? Don’t count on it (Даже не думай)
    ? My reply is no (Мой ответ — «нет»)
    ? My sources say no (По моим данным — «нет»)
    ? Outlook not so good (Перспективы не очень хорошие)
    ? Very doubtful (Весьма сомнительно) 

 */
public class Display {
	
	String[] ansver;
	
	public Display(){
		ansver = new String[20];
		//positive ansver
		ansver[0] = "It is certain (Бесспорно)";
		ansver[1] = "It is decidedly so (Предрешено)";
		ansver[2] = "Without a doubt (Никаких сомнений)";
		ansver[3] = "Yes — definitely (Определённо да)";
		ansver[4] = "You may rely on it (Можешь быть уверен в этом)";
		//maybe positive ansver
		ansver[5] = "As I see it, yes (Мне кажется — «да»)";
		ansver[6] = "Most likely (Вероятнее всего)";
		ansver[7] = "Outlook good (Хорошие перспективы)";
		ansver[8] = "Signs point to yes (Знаки говорят — «да»)";
		ansver[9] = "Yes (Да)";
		// neutral
		ansver[10] = "Reply hazy, try again (Пока не ясно, попробуй снова)";
		ansver[11] = "Ask again later (Спроси позже)";
		ansver[12] = "Better not tell you now (Лучше не рассказывать)";
		ansver[13] = "Cannot predict now (Сейчас нельзя предсказать)";
		ansver[14] = "Concentrate and ask again (Сконцентрируйся и спроси опять)";
		// negative
		ansver[15] = "Don’t count on it (Даже не думай)";
		ansver[16] = " My reply is no (Мой ответ — «нет»)";
		ansver[17] = "My sources say no (По моим данным — «нет»)";
		ansver[18] = "Outlook not so good (Перспективы не очень хорошие)";
		ansver[19] = "Very doubtful (Весьма сомнительно) ";
				
	}
	public void getAnsver(){
		int rand = (int) (Math.random()*20);
		String Ansver = ansver[rand];
		System.out.println(Ansver);
	}
}
