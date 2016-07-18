/*
public class CopyFileFromOneToAnother {

	public static void main(String[] args) {
		File f = new File(
	            "D:\\CBSE_Demo\\Demo_original\\fscommand\\contentplayer\\config");
	        List<String>temp=new ArrayList<String>();
	        temp.add(0, "N33");
	        temp.add(1, "N1417");
	        temp.add(2, "N331");
	        File[] matchingFiles = null;
	        for(final String temp1: temp){
	            matchingFiles = f.listFiles(new FilenameFilter() {
	                public boolean accept(File dir, String name) {
	                    return name.startsWith(temp1);
	                }
	            });
	            System.out.println("size>>--"+matchingFiles.length);
	}

}
*/