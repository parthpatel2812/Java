package T_27_Networking;
import java.applet.AppletContext;
import java.awt.*;
import java.net.MalformedURLException;
import java.net.URL;
import java.util.ArrayList;
import java.util.*;
import javax.swing.*;
import javax.swing.event.*;

public class parthn extends JApplet
{
	private HashMap<String, URL> websiteInfo;
	private ArrayList<String> titles;
	private JList myList;
	
	//init
	public void init()
	{
		websiteInfo = new HashMap<String, URL>();
		titles = new ArrayList<String>();
		
		grabeHTMLInfo();
		
		add(new JLabel("What websit you wanna visit "),BorderLayout.NORTH);
		
		myList = new JList(titles.toArray());
		
		myList.addListSelectionListener(
				new ListSelectionListener()
				{
					public void valueChanged(ListSelectionEvent event)
					{
						Object object = myList.getSelectedValue();
						
						URL newDocument = websiteInfo.get(object);
						
						AppletContext browser = getAppletContext();
						browser.showDocument(newDocument);
					}
				}
				);
	}
	
	// grabHTMLinfo (get website info)
	private void grabeHTMLInfo()
	{
		String title;
		String address;
		URL url;
		int counter = 0;
		title = getParameter("titlt" + counter);
		
		while(title != null)
		{
			address = getParameter("address"+counter);
			try
			{
				url = new URL(address);
				websiteInfo.put(title, url);
				titles.add(title);
			}
			catch(MalformedURLException urlException)
			{
				urlException.printStackTrace();
			}
			++counter;
			title = getParameter("title" +counter);
		}
	}
	
	
}
