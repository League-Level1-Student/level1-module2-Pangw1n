package _99_extra._04_tea_party;

public class TeaParty {
	public static void main(String[] args) {
		TeaParty teaParty = new TeaParty();
		teaParty.Start();
	}
	
	public void Start()
	{
		System.out.println(welcome("George Orwell", false, true));
	}

    public String welcome(String name, boolean isWoman, boolean isKnighted) {
		String title;
    	if (isWoman)
		{
    		if (isKnighted)
    		{
    			title = "Lady";
    		}
    		else
    		{
    			title = "Ms.";
    		}
		}
    	else
    	{
    		if (isKnighted)
    		{
    			title = "Sir";
    		}
    		else
    		{
    			title = "Mr.";
    		}
    	}
    	return "Hello " + title + " " + name;
    }
}
