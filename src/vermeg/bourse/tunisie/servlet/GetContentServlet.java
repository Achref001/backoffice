package vermeg.bourse.tunisie.servlet;

import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

import javax.ws.rs.GET;
import javax.ws.rs.Path;
import javax.ws.rs.PathParam;
import javax.ws.rs.Produces;
import javax.ws.rs.container.ContainerRequestContext;
import javax.ws.rs.container.ContainerResponseContext;
import javax.ws.rs.container.ContainerResponseFilter;
import javax.ws.rs.core.MediaType;
import javax.ws.rs.ext.Provider;

import org.jsoup.Jsoup;
import org.jsoup.nodes.Document;
import org.jsoup.select.Elements;

import vermeg.bourse.tunisie.entity.Content;
import vermeg.bourse.tunisie.entity.Cotations;
import vermeg.bourse.tunisie.entity.Devise;
import vermeg.bourse.tunisie.entity.Palmeras;

@Path("/feeds")
@Provider
public class GetContentServlet implements ContainerResponseFilter {
	
	
	
	

//	@GET
//	@Produces(MediaType.APPLICATION_JSON)
//	@Path("/DerniereActu")
//	public List<Content> getActuContent() {
//		Content content1 = new Content();
//		Content content2 = new Content();
//		Content content3 = new Content();
//
//		List<Content> lContent = new ArrayList<Content>();
//		// Description description = new Description();
//
//		Document doc;
//		Elements els;
//
//		try {
//			doc = Jsoup.connect("http://www.bvmt.com.tn/").get();
//			// add the first element of derniere actualité
//			els = doc
//					.select("#center #center-left #block-bvmt-blocks-hp-block-lastnews >div ul li.avis  ")
//					.eq(0);
//			content1.setTag("Dernières actualités 0");
//			content1.setValue(els.text().toString());
//			lContent.add(content1);
//
//			// add the second element of derniere actualité
//			els = doc
//					.select("#center #center-left #block-bvmt-blocks-hp-block-lastnews >div ul li.avis  ")
//					.eq(1);
//			content2.setTag("Dernières actualités 1");
//			content2.setValue(els.text().toString());
//			lContent.add(content2);
//
//			// add the third element of derniere actualité
//			els = doc
//					.select("#center #center-left #block-bvmt-blocks-hp-block-lastnews >div ul li.avis  ")
//					.eq(2);
//			content3.setTag("Dernières actualités 2");
//			content3.setValue(els.text().toString());
//			lContent.add(content3);
//
//			// System.out.println("dsdsddsds" + els.text().toString());
//
//		} catch (IOException e) {
//			// TODO Auto-generated catch block
//			e.printStackTrace();
//		}
//
//		return lContent;
//	}

//	@GET
//	@Produces(MediaType.APPLICATION_JSON)
//	@Path("/InformationSociete")
//	public List<Content> getInfSoc() {
//		Content content1 = new Content();
//		Content content2 = new Content();
//		Content content3 = new Content();
//
//		List<Content> lContent = new ArrayList<Content>();
//
//		Document doc;
//		Elements els;
//
//		try {
//			doc = Jsoup.connect("http://www.bvmt.com.tn/").get();
//			// add the first element of derniere actualité
//			els = doc
//					.select("#center #center-left #block-bvmt-blocks-hp-block-societes >div ul li.avis  ")
//					.eq(0);
//			content1.setTag("Dernières actualités 0");
//			content1.setValue(els.text().toString());
//			lContent.add(content1);
//
//			// add the second element of derniere actualité
//			els = doc
//					.select("#center #center-left #block-bvmt-blocks-hp-block-societes >div ul li.avis  ")
//					.eq(1);
//			content2.setTag("Dernières actualités 1");
//			content2.setValue(els.text().toString());
//			lContent.add(content2);
//
//			// add the third element of derniere actualité
//			els = doc
//					.select("#center #center-left #block-bvmt-blocks-hp-block-societes >div ul li.avis  ")
//					.eq(2);
//			content3.setTag("Dernières actualités 2");
//			content3.setValue(els.text().toString());
//			lContent.add(content3);
//
//			// System.out.println("dsdsddsds" + els.text().toString());
//
//		} catch (IOException e) {
//			// TODO Auto-generated catch block
//			e.printStackTrace();
//		}
//
//		return lContent;
//	}

	@GET
	@Produces(MediaType.APPLICATION_JSON)
	@Path("/GetAvisEtDecisionsDesBourses")
	public List<Content> GetAviesEtDecisionsDesBourses() {
		Content content1 = new Content();
		Content content2 = new Content();
		List<Content> lContent = new ArrayList<Content>();
		Document doc;
		Elements els;

		try {
			doc = Jsoup.connect("http://www.bvmt.com.tn/").get();
			// add the first element of derniere actualité
			els = doc
					.select("#center #center-right #block-bvmt-blocks-hp-block-avis >div ul li.avis  ")
					.eq(0);
			content1.setTag("Evis et Décisions Bourse 0");
			content1.setValue(els.text().toString());
			lContent.add(content1);
			// add the second element of derniere actualité
			els = doc
					.select("#center #center-right #block-bvmt-blocks-hp-block-avis >div ul li.avis  ")
					.eq(1);
			content2.setTag("Avis et décisions bourse 1");
			content2.setValue(els.text().toString());
			lContent.add(content2);
			content2 = null;

		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}

		return lContent;
	}

//	@GET
//	@Produces(MediaType.APPLICATION_JSON)
//	@Path("/GetCommuniqueDelaPresse")
//	public List<Content> GetCommuniqueDeLaPresse() {
//		List<Content> lcontent = new ArrayList<Content>();
//		Content mContent = new Content();
//		Document doc;
//		Elements els;
//
//		try {
//			doc = Jsoup.connect("http://www.bvmt.com.tn/").get();
//			// add the first element of derniere actualité
//			els = doc
//					.select("#center #block-left  >div  ")
//					.eq(0);
//			mContent.setTag("Communiquer de la presse article 1");
//			mContent.setValue(els.text().toString());
//			lcontent.add(mContent);
//		} catch (Exception e) {
//			e.printStackTrace();
//			System.out
//					.println("+++++++++++Error while trying to load block communiquer de la presse +++++++++++++");
//		}
//
//		return lcontent;
//	}

	// this funtion is used to get "derniereActu article 1
//	@GET
//	@Produces(MediaType.APPLICATION_JSON)
//	@Path("/DerniereActuArticle1")
//	public List<Content> GetDerniereActuArticle1() {
//		List<Content> lcontent = new ArrayList<Content>();
//		Content title = new Content();
//		Content date = new Content();
//		Content content = new Content();
//		Document doc;
//		Elements els;
//
//		try {
//			doc = Jsoup
//					.connect(
//							"http://www.bvmt.com.tn/fr/content/evolution-des-revenus-des-soci%C3%A9t%C3%A9s-cot%C3%A9es-au-31-mars-2015")
//					.get();
//			els = doc
//			// get the title
//					.select("#center #block-left #block-system-main  > div h3");
//			// .select("#center #block-left #block-system-main  > div p").eq(0);
//
//			title.setTag("title");
//			title.setValue(els.text().toString());
//			lcontent.add(title);
//
//			els = doc
//					// get the title
//					// .select("#center #block-left #block-system-main  > div h3");
//					.select("#center #block-left #block-system-main  > div p")
//					.eq(0);
//
//			date.setTag("date");
//			date.setValue(els.text().toString());
//			lcontent.add(date);
//
//			els = doc
//			// get the title
//			// .select("#center #block-left #block-system-main  > div h3");
//					.select("#center #block-left #block-system-main  > div p");
//
//			content.setTag("content");
//			content.setValue(els.text().toString());
//			lcontent.add(content);
//
//		} catch (Exception e) {
//			System.out.println("+++++++++ derniereActu article1++++++++++++");
//			e.printStackTrace();
//		}
//
//		return lcontent;
//	}

	// throw this function we will get the full content of the second dernière
	// actualité article

//	@GET
//	@Produces(MediaType.APPLICATION_JSON)
//	@Path("/DerniereActuArticle2")
//	public List<Content> GetDerniereActuArticle2() {
//		List<Content> lcontent = new ArrayList<Content>();
//		Content title = new Content();
//		Content date = new Content();
//		Content content = new Content();
//		Document doc;
//		Elements els;
//
//		try {
//			doc = Jsoup
//					.connect(
//							"http://www.bvmt.com.tn/fr/content/evolution-des-revenus-des-soci%C3%A9t%C3%A9s-cot%C3%A9es-au-31-mars-2015")
//					.get();
//			els = doc
//			// get the title
//					.select("#center #block-left #block-system-main  > div h3");
//			// .select("#center #block-left #block-system-main  > div p").eq(0);
//
//			title.setTag("title");
//			title.setValue(els.text().toString());
//			lcontent.add(title);
//
//			els = doc
//					// get the title
//					// .select("#center #block-left #block-system-main  > div h3");
//					.select("#center #block-left #block-system-main  > div p")
//					.eq(0) ;
//
//			date.setTag("date");
//			date.setValue(els.text().toString());
//			lcontent.add(date);
//
//			els = doc
//			// get the title
//			// .select("#center #block-left #block-system-main  > div h3");
//					.select("#center #block-left #block-system-main  > div p");
//
//			content.setTag("content");
//			content.setValue(els.text().toString());
//			lcontent.add(content);
//
//		} catch (Exception e) {
//			System.out.println("+++++++++ derniereActu article1++++++++++++");
//			e.printStackTrace();
//		}
//
//		return lcontent;
//	}

	// get the last feed news from ilbourse.com
	// http://www.ilboursa.com/marches/actualites_bourse_tunis.aspx

	@GET
	@Produces(MediaType.APPLICATION_JSON)
	@Path("/LastFeedilboursa")
	public List<Content> getLastFeedFromIlbourseDOTcom() {
		List<Content> lcontent = new ArrayList<Content>();

		Document doc;
		Elements els;

		try {

			doc = Jsoup
					.connect(
							"http://www.ilboursa.com/marches/actualites_bourse_tunis.aspx")
					.get();
			// add the first element of derniere actualité
			for (int i = 0; i < 30; i++) {
				Content content = new Content();

				els = doc
						// .select("#aspnetForm  > div.bk_bc div.contentpad div table.tablesorter span.sp1")
						.select("#aspnetForm  > div.bk_bc div.contentpad div table.tablesorter tr")
						.eq(i);

				content.setTag("feed number" + i);
				content.setValue(els.text().toString());
				lcontent.add(content);
			}

		} catch (Exception e) {
			System.out.println("+++++++++ derniereActu article1++++++++++++");
			e.printStackTrace();
		}

		return lcontent;
	}
	
	
	
	
	@GET
	@Produces(MediaType.APPLICATION_JSON)
	@Path("/urlpics")
	public List<Content> geturlpics() {
	 List<Content> lcontent = new ArrayList<Content>();


		Document doc;
		Elements els;
		Document doc2;
		Elements els2;

		try {
			doc = Jsoup.connect("http://www.ilboursa.com/marches/actualites_bourse_tunis.aspx").get();
			//add the first element of derniere actualité
			
			
			// add the first element of derniere actualité
			for (int i = 0; i < 30; i++) {
				Content content = new Content();
				
				els = doc
						//.select("#aspnetForm  > div.bk_bc div.contentpad div table.tablesorter span.sp1")
						.select("#aspnetForm  > div.bk_bc div.contentpad div table.tablesorter tr").eq(i).select("a")

						;
				
				int debut = els.toString().indexOf("=");
				int fin = els.toString().indexOf(">");
				String urlpic = els.toString().substring(debut+2 ,fin-1);
				try
				{
				//getting the real url pic
				doc2 = Jsoup.connect("http://www.ilboursa.com/marches/"+urlpic).get();
				content.setUrl("http://www.ilboursa.com/marches/"+urlpic);
				els2 = doc2
						//.select("#aspnetForm  > div.bk_bc div.contentpad div table.tablesorter span.sp1")
						.select("#aspnetForm  > div.bk_bc div.contentpad div.txtbig p img")

						;
				int start = els2.toString().indexOf("=");
				int end =  els2.toString().indexOf("alt");
				String picurl = els2.toString().substring(start+2 ,end-2);
				content.setValue(picurl);
				}
				catch (Exception ee)
				{System.out.println("image introuvable");
				ee.printStackTrace();
				content.setValue("F:/Users/Achref/Documents/BourseFinal1/www/icons pictures/Not-found.jpg");

				
				}
				content.setTag(els.text().toString());
				content.setId(i);
				System.out.println("+++++++++++"+i+"++++++++++++++++");
//				System.out.println("deb"+debut + "fin"+fin);
//				String urlpic = els.toString().substring(debut+2 ,fin-1);
//				System.out.println(urlpic);
//				System.out.println("+++++++++++++++"+content.getValue().toString());
				lcontent.add(content);
			}

		} catch (Exception e) {
			System.out.println("+++++++++ derniereActu article1++++++++++++");
			e.printStackTrace();
		}

		return lcontent;
	}
	
	
	@GET
	@Produces(MediaType.APPLICATION_JSON)
	@Path("/showmore/{param}")
	public Content showMoreDetails(@PathParam("param")int param)
	{
		List<Content> contents = new ArrayList<Content>();
		contents=geturlpics(); 
		Content content = new Content() ;
		Document doc;
		Elements els;
	
		Elements els2;
		Elements els3;

		try {
			
			
			doc = Jsoup
					.connect(contents.get(param).getUrl())
					.get();
			els = doc
					//.select("#aspnetForm  > div.bk_bc div.contentpad div table.tablesorter span.sp1")
					.select("#aspnetForm  > div.bk_bc div.contentpad div.txtbig p")
					;

			els2 = doc
					//.select("#aspnetForm  > div.bk_bc div.contentpad div table.tablesorter span.sp1")
					.select("#aspnetForm  > div.bk_bc div.innerUp h1").eq(0)
					;
			els3 = doc.select("#aspnetForm  > div.bk_bc div.contentpad div.txtbig p img")
			;
			content.setTag(els2.text().toString());
			content.setValue(els.text().toString());
			
			int start = els3.toString().indexOf("=");
			int end =  els3.toString().indexOf("alt");
			String picurl = els3.toString().substring(start+2 ,end-2);
			
			content.setUrl(picurl);
			
		}
		catch (Exception e)
		{
			e.printStackTrace();
		}
		return content ;
	}

	@GET
	@Produces(MediaType.APPLICATION_JSON)
	@Path("/CoursDevisesDate")
	public String  ConvertisseurDeviseDate()
	{
		Document docd;
		Elements elsd;
		String date =null  ;

		try {
			
			docd = Jsoup
					.connect(
							"http://www.biat.com.tn/biat/cours_devise.jsp")
					.get();
			elsd = docd.select("td.RegionHeaderColor p") ;
			date = elsd.text().toString() ;
		}
			catch(Exception e)
			{
				e.printStackTrace();
			}
			return date ;
	}
	
	
	@GET
	@Produces(MediaType.APPLICATION_JSON)
	@Path("/CoursDevises")
	public List<Devise>  ConvertisseurDevise()
	{
		List<Devise> lcontent = new ArrayList<Devise>();

		Document doc;
		Elements els0; 
		Elements els1;
		Elements els2;
		Elements els3;
		Elements els4;
		
		
		try
		{
		
		
			


			doc = Jsoup
					.connect(
							"http://www.biat.com.tn/biat/cours_devise.jsp")
					.get();
			// add the first element of derniere actualité
			for (int i = 0; i < 13; i++) {
				Devise content = new Devise();

				els0 = doc
						// .select("#aspnetForm  > div.bk_bc div.contentpad div table.tablesorter span.sp1")
						.select("td.RegionHeaderColor tr.fontdevise1").eq(i).select("td").eq(0) ;

				els1 = doc
						// .select("#aspnetForm  > div.bk_bc div.contentpad div table.tablesorter span.sp1")
						.select("td.RegionHeaderColor tr.fontdevise1").eq(i).select("td").eq(1) ;
				
				els2 = doc
						// .select("#aspnetForm  > div.bk_bc div.contentpad div table.tablesorter span.sp1")
						.select("td.RegionHeaderColor tr.fontdevise1").eq(i).select("td").eq(2) ;
				
				els3 = doc
						// .select("#aspnetForm  > div.bk_bc div.contentpad div table.tablesorter span.sp1")
						.select("td.RegionHeaderColor tr.fontdevise1").eq(i).select("td").eq(3) ;
				
				els4 = doc
						// .select("#aspnetForm  > div.bk_bc div.contentpad div table.tablesorter span.sp1")
						.select("td.RegionHeaderColor tr.fontdevise1").eq(i).select("td").eq(4) ;
				content.setCountry(els0.text().toString());
				content.setCode(els1.text().toString());
				content.setUnity(els2.text().toString());
				content.setAchat(els3.text().toString());
				content.setVente(els4.text().toString());
				lcontent.add(content);
			}

		} catch (Exception e) {
			System.out.println("+++++++++ derniereActu article1++++++++++++");
			e.printStackTrace();
		}

		return lcontent;
	}
	
	
	@GET
	@Produces(MediaType.APPLICATION_JSON)
	@Path("/getcotations")
	public List<Cotations> getcotations() {
		
		

		List<Cotations> lContent = new ArrayList<Cotations>();

		Document doc;
		Elements els;

		try {
			doc = Jsoup.connect("http://www.ilboursa.com/marches/aaz.aspx").get();
			// add the first element of derniere actualité
			for (int i=0 ;i<640 ; i=i+8)
			{
				
				Cotations Cotations = new Cotations();
			els = doc
					.select("#aspnetForm  > div.bk_bc div.contentpad table.tablesorter td").eq(i)
					;
			System.out.println("++++++++++"+i+"++++++++++++++++++\n"+els.text().toString());
			Cotations.setNom(els.text().toString());
			els = doc
					.select("#aspnetForm  > div.bk_bc div.contentpad table.tablesorter td").eq(i+1)
					;
			System.out.println("++++++++++"+i+1+"++++++++++++++++++"+els.text().toString());
			Cotations.setOuverture(els.text().toString());
			els = doc
					.select("#aspnetForm  > div.bk_bc div.contentpad table.tablesorter td").eq(i+2)
					;
			System.out.println("++++++++++"+i+2+"++++++++++++++++++"+els.text().toString());
			Cotations.setHaut(els.text().toString());
			els = doc
					.select("#aspnetForm  > div.bk_bc div.contentpad table.tablesorter td").eq(i+3)
					;
			System.out.println("++++++++++"+i+3+"++++++++++++++++++"+els.text().toString());
			Cotations.setBas(els.text().toString());
			els = doc
					.select("#aspnetForm  > div.bk_bc div.contentpad table.tablesorter td").eq(i+4)
					;
			System.out.println("++++++++++"+i+4+"++++++++++++++++++"+els.text().toString());
			Cotations.setVolume(els.text().toString());
			els = doc
					.select("#aspnetForm  > div.bk_bc div.contentpad table.tablesorter td").eq(i+5)
					;
			System.out.println("++++++++++"+i+5+"++++++++++++++++++"+els.text().toString());
			Cotations.setVolume2(els.text().toString());
			els = doc
					.select("#aspnetForm  > div.bk_bc div.contentpad table.tablesorter td").eq(i+6)
					;
			System.out.println("++++++++++"+i+6+"++++++++++++++++++"+els.text().toString());
			Cotations.setDernier(els.text().toString());
			els = doc
					.select("#aspnetForm  > div.bk_bc div.contentpad table.tablesorter td").eq(i+7)
					;
			System.out.println("++++++++++"+i+7+"++++++++++++++++++"+els.text().toString());
			Cotations.setVariation(els.text().toString());
			lContent.add(Cotations);
			}

		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}

		return lContent;
	}
	
	
	
	@GET
	@Produces(MediaType.APPLICATION_JSON)
	@Path("/palmares")
	public List<Palmeras> getpalmares() {
		
		

		List<Palmeras> lContent = new ArrayList<Palmeras>();

		Document doc;
		Elements els;

		try {
			doc = Jsoup.connect("http://www.ilboursa.com/marches/palmares.aspx").get();
			// add the first element of derniere actualité
			for (int i=0 ;i<180 ; i=i+7)
			{
				
				Palmeras Cotations = new Palmeras();
			els = doc
					.select("#aspnetForm  > div.bk_bc div.contentpad table.tablesorter td").eq(i)
					;
			System.out.println("++++++++++"+i+"++++++++++++++++++\n"+els.text().toString());
			Cotations.setNom(els.text().toString());
			els = doc
					.select("#aspnetForm  > div.bk_bc div.contentpad table.tablesorter td").eq(i+1)
					;
			System.out.println("++++++++++"+i+1+"++++++++++++++++++"+els.text().toString());
			Cotations.setHaut(els.text().toString());
			els = doc
					.select("#aspnetForm  > div.bk_bc div.contentpad table.tablesorter td").eq(i+2)
					;
			System.out.println("++++++++++"+i+2+"++++++++++++++++++"+els.text().toString());
			Cotations.setBas(els.text().toString());
			els = doc
					.select("#aspnetForm  > div.bk_bc div.contentpad table.tablesorter td").eq(i+3)
					;
			System.out.println("++++++++++"+i+3+"++++++++++++++++++"+els.text().toString());
			Cotations.setDernier(els.text().toString());
			els = doc
					.select("#aspnetForm  > div.bk_bc div.contentpad table.tablesorter td").eq(i+4)
					;
			System.out.println("++++++++++"+i+4+"++++++++++++++++++"+els.text().toString());
			Cotations.setVolume(els.text().toString());
			els = doc
					.select("#aspnetForm  > div.bk_bc div.contentpad table.tablesorter td").eq(i+5)
					;
			System.out.println("++++++++++"+i+5+"++++++++++++++++++"+els.text().toString());
	    	Cotations.setVariationdujour(els.text().toString());
			
			lContent.add(Cotations);
			}

		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}

		return lContent;
	}
	
	
	
	
	
	
	
//	@GET
//	@Produces(MediaType.APPLICATION_JSON)
//	@Path("/apprendreBourse")
//public List<Content> apprendreBourse() {
//		
//		
//
//		List<Content> lContent = new ArrayList<Content>();
//		lContent= null ;
//		Content content = new Content();
//		content = null ;
//		//content = null ;
//		Document doc;
//		Elements els;
//	
//		Elements els2;
//
//		try {
//			doc = Jsoup.connect("http://www.ilboursa.com/apprendre/comment-lire-les-graphiques-boursiers.aspx").get();
//			//add the first element of derniere actualité
//			
//			els = doc
//					//.select("#aspnetForm  > div.bk_bc div.contentpad div table.tablesorter span.sp1")
//					.select("#aspnetForm  > div.bk_bc div.contentpad p ")
//					;
//			System.out.println("+++++++++++++++"+els.text().toString()+"+++++++++++");
//			content.setValue(els.text().toString());
//
//			//add the first element of derniere actualité
//			
//			els2 = doc
//					//.select("#aspnetForm  > div.bk_bc div.contentpad div table.tablesorter span.sp1")
//					.select("#aspnetForm  > div.bk_bc div.contentpad table td ").eq(0);
//					;
//					String imgp = els.toString();
//					int start = imgp.indexOf("=");
//					int end =  imgp.indexOf("alt");
//					imgp ="http://www.ilboursa.com/" + imgp.substring(start+2 ,end-2);
//			content.setUrl(imgp);
//			System.out.println("+++++++++++++++"+imgp+"+++++++++++");
//
////			els2 = doc
////					//.select("#aspnetForm  > div.bk_bc div.contentpad div table.tablesorter span.sp1")
////					.select("#aspnetForm  > div.bk_bc div.contentpad table td ").eq(1);
////					;
////					content.setValue(els2.text().toString());
//					lContent.add(content);
//
//		} catch (IOException e) {
//			// TODO Auto-generated catch block
//			e.printStackTrace();
//			System.out.println("++++++++++++++++++Error+++++++++++++");
//		}
//
//		return lContent;
//	}
//	
	

	@Override
	public void filter(final ContainerRequestContext requestContext,
			final ContainerResponseContext cres) throws IOException {
		cres.getHeaders().add("Access-Control-Allow-Origin", "*");
		cres.getHeaders().add("Access-Control-Allow-Headers",
				"origin, content-type, accept, authorization");
		cres.getHeaders().add("Access-Control-Allow-Credentials", "true");
		cres.getHeaders().add("Access-Control-Allow-Methods",
				"GET, POST, PUT, DELETE, OPTIONS, HEAD");
		cres.getHeaders().add("Access-Control-Max-Age", "1209600");
	}

}
