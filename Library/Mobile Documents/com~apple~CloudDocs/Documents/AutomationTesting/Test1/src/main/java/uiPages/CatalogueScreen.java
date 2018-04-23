package uiPages;

public class CatalogueScreen {

    public static String navigationDrawer(){ return "//android.widget.ImageButton[@content-desc=\"Open navigation drawer\"]";}
    public static String navigationBarTitle(){ return "/hierarchy/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.view.ViewGroup/android.widget.LinearLayout/android.widget.LinearLayout/android.view.ViewGroup/android.widget.TextView";}
    public static String searchIcon(){ return "de.autodoc.gmbh:id/action_search";}
    public static String basketIcon(){ return "de.autodoc.gmbh:id/action_cart";}
    public static String addCartButton(){ return "de.autodoc.gmbh:id/fabAddCar";}
    public static String allCategories(){ return "de.autodoc.gmbh:id/tvAllCategoriesLabel";}

    public static String logoCar(){ return "de.autodoc.gmbh:id/logoCar";}
    public static String nextButton(){ return "de.autodoc.gmbh:id/imageView"; }

    public static String timer(){ return "/hierarchy/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.view.ViewGroup/android.widget.LinearLayout/android.support.v4.widget.DrawerLayout/android.widget.FrameLayout/android.widget.FrameLayout/android.widget.LinearLayout[2]/android.widget.RelativeLayout/android.widget.LinearLayout/android.widget.LinearLayout/android.widget.LinearLayout/android.widget.LinearLayout[3]/android.widget.TextView[1]";}

    public static String banner(){ return "de.autodoc.gmbh:id/layout_baner";}
}
