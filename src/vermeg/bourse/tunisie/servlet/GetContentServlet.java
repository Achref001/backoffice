package vermeg.bourse.tunisie.servlet;

import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

import javax.ws.rs.GET;
import javax.ws.rs.Path;
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

@Path("/feeds")
@Provider
public class GetContentServlet implements ContainerResponseFilter {

	@GET
	@Produces(MediaType.APPLICATION_JSON)
	@Path("/DerniereActu")
	public List<Content> getActuContent() {
		Content content1 = new Content();
		Content content2 = new Content();
		Content content3 = new Content();

		List<Content> lContent = new ArrayList<Content>();
		// Description description = new Description();

		Document doc;
		Elements els;

		try {
			doc = Jsoup.connect("http://www.bvmt.com.tn/").get();
			// add the first element of derniere actualité
			els = doc
					.select("#center #center-left #block-bvmt-blocks-hp-block-lastnews >div ul li.avis  ")
					.eq(0);
			content1.setTag("Dernières actualités 0");
			content1.setValue(els.text().toString());
			lContent.add(content1);

			// add the second element of derniere actualité
			els = doc
					.select("#center #center-left #block-bvmt-blocks-hp-block-lastnews >div ul li.avis  ")
					.eq(1);
			content2.setTag("Dernières actualités 1");
			content2.setValue(els.text().toString());
			lContent.add(content2);

			// add the third element of derniere actualité
			els = doc
					.select("#center #center-left #block-bvmt-blocks-hp-block-lastnews >div ul li.avis  ")
					.eq(2);
			content3.setTag("Dernières actualités 2");
			content3.setValue(els.text().toString());
			lContent.add(content3);

			// System.out.println("dsdsddsds" + els.text().toString());

		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}

		return lContent;
	}

	@GET
	@Produces(MediaType.APPLICATION_JSON)
	@Path("/InformationSociete")
	public List<Content> getInfSoc() {
		Content content1 = new Content();
		Content content2 = new Content();
		Content content3 = new Content();

		List<Content> lContent = new ArrayList<Content>();

		Document doc;
		Elements els;

		try {
			doc = Jsoup.connect("http://www.bvmt.com.tn/").get();
			// add the first element of derniere actualité
			els = doc
					.select("#center #center-left #block-bvmt-blocks-hp-block-societes >div ul li.avis  ")
					.eq(0);
			content1.setTag("Dernières actualités 0");
			content1.setValue(els.text().toString());
			lContent.add(content1);

			// add the second element of derniere actualité
			els = doc
					.select("#center #center-left #block-bvmt-blocks-hp-block-societes >div ul li.avis  ")
					.eq(1);
			content2.setTag("Dernières actualités 1");
			content2.setValue(els.text().toString());
			lContent.add(content2);

			// add the third element of derniere actualité
			els = doc
					.select("#center #center-left #block-bvmt-blocks-hp-block-societes >div ul li.avis  ")
					.eq(2);
			content3.setTag("Dernières actualités 2");
			content3.setValue(els.text().toString());
			lContent.add(content3);

			// System.out.println("dsdsddsds" + els.text().toString());

		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}

		return lContent;
	}

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

	@GET
	@Produces(MediaType.APPLICATION_JSON)
	@Path("/GetCommuniqueDelaPresse")
	public List<Content> GetCommuniqueDeLaPresse() {
		List<Content> lcontent = new ArrayList<Content>();
		Content mContent = new Content();
		Document doc;
		Elements els;

		try {
			doc = Jsoup.connect("http://www.bvmt.com.tn/").get();
			// add the first element of derniere actualité
			els = doc
					.select("#center #center-right #block-bvmt-blocks-hp-block-communiques >div ul li.avis  ")
					.eq(0);
			mContent.setTag("Communiquer de la presse article 1");
			mContent.setValue(els.text().toString());
			lcontent.add(mContent);
		} catch (Exception e) {
			e.printStackTrace();
			System.out
					.println("+++++++++++Error while trying to load block communiquer de la presse +++++++++++++");
		}

		return lcontent;
	}

	// this funtion is used to get "derniereActu article 1
	@GET
	@Produces(MediaType.APPLICATION_JSON)
	@Path("/DerniereActuArticle1")
	public List<Content> GetDerniereActuArticle1() {
		List<Content> lcontent = new ArrayList<Content>();
		Content title = new Content();
		Content date = new Content();
		Content content = new Content();
		Document doc;
		Elements els;

		try {
			doc = Jsoup
					.connect(
							"http://www.bvmt.com.tn/fr/content/evolution-des-revenus-des-soci%C3%A9t%C3%A9s-cot%C3%A9es-au-31-mars-2015")
					.get();
			els = doc
			// get the title
					.select("#center #block-left #block-system-main  > div h3");
			// .select("#center #block-left #block-system-main  > div p").eq(0);

			title.setTag("title");
			title.setValue(els.text().toString());
			lcontent.add(title);

			els = doc
					// get the title
					// .select("#center #block-left #block-system-main  > div h3");
					.select("#center #block-left #block-system-main  > div p")
					.eq(0);

			date.setTag("date");
			date.setValue(els.text().toString());
			lcontent.add(date);

			els = doc
			// get the title
			// .select("#center #block-left #block-system-main  > div h3");
					.select("#center #block-left #block-system-main  > div p");

			content.setTag("content");
			content.setValue(els.text().toString());
			lcontent.add(content);

		} catch (Exception e) {
			System.out.println("+++++++++ derniereActu article1++++++++++++");
			e.printStackTrace();
		}

		return lcontent;
	}

	// throw this function we will get the full content of the second dernière
	// actualité article

	@GET
	@Produces(MediaType.APPLICATION_JSON)
	@Path("/DerniereActuArticle2")
	public List<Content> GetDerniereActuArticle2() {
		List<Content> lcontent = new ArrayList<Content>();
		Content title = new Content();
		Content date = new Content();
		Content content = new Content();
		Document doc;
		Elements els;

		try {
			doc = Jsoup
					.connect(
							"http://www.bvmt.com.tn/fr/content/evolution-des-revenus-des-soci%C3%A9t%C3%A9s-cot%C3%A9es-au-31-mars-2015")
					.get();
			els = doc
			// get the title
					.select("#center #block-left #block-system-main  > div h3");
			// .select("#center #block-left #block-system-main  > div p").eq(0);

			title.setTag("title");
			title.setValue(els.text().toString());
			lcontent.add(title);

			els = doc
					// get the title
					// .select("#center #block-left #block-system-main  > div h3");
					.select("#center #block-left #block-system-main  > div p")
					.eq(0) ;

			date.setTag("date");
			date.setValue(els.text().toString());
			lcontent.add(date);

			els = doc
			// get the title
			// .select("#center #block-left #block-system-main  > div h3");
					.select("#center #block-left #block-system-main  > div p");

			content.setTag("content");
			content.setValue(els.text().toString());
			lcontent.add(content);

		} catch (Exception e) {
			System.out.println("+++++++++ derniereActu article1++++++++++++");
			e.printStackTrace();
		}

		return lcontent;
	}

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
