package Class;

import java.util.ArrayList;
import java.util.List;
import java.io.FileOutputStream;

public abstract class Category {
	private static List <Category> categoryList = new ArrayList <Category>();
	
	protected String categoryName;
	
	//Category Constructor
	Category(String categoryName){
		this.categoryName = categoryName;
		
		categoryList.add(this);
	}

	//categoryName Getter and Setter
	public String getCategoryName() {
		return categoryName;
	}

	public void setCategoryName(String categoryName) {
		this.categoryName = categoryName;
	}
	
	//Category List Size
	public static int categoryListSize() {
		return categoryList.size();
	}
	
	//Show Categories
	public static void showCategoryName() {
		System.out.println("\nList of categories:");
		for (int i = 0; i < categoryList.size(); i++) {
			System.out.println(i + 1 + ". " + (categoryList.get(i)).getCategoryName());
		}
	}
	
	//Write Categories File
	public static void writeCategoriesFile() {
		String category;
		FileOutputStream fos = null;
		
		try {
			fos = new FileOutputStream("./CategoryListFile.txt");
			for (int i = 0; i < Category.categoryListSize(); i++) {
				category = i + 1 + ". " + (categoryList.get(i)).getCategoryName();
				
				fos.write((category).getBytes());
				fos.write(System.getProperty("line.separator").getBytes());
			}
		} catch (Exception e) {
			e.printStackTrace();
		} finally {
			try {
				fos.close();
			}catch (Exception e) {	
			}
		}
		System.out.println("\nCategory List File generated successfully!");
	}
}