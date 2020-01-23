package restaurant;

public class MenuItem {
    private String name;
    private String description;
    private double price;
    private String category;
    private boolean isNew;

    public MenuItem(String name, String description, double price, String category, boolean isNew) {
        this.name = name;
        this.description = description;
        this.price = price;
        this.category = category;
        if (isNew) {
            this.isNew = true;
        } else {
            this.isNew = false;
        }
    }

    public String getName() {
        return name;
    }

    public String getDescription() {
        return description;
    }

    public double getPrice() {
        return price;
    }

    public String getCategory() {
        return category;
    }

    public boolean getIsNew() {
        return isNew;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public void setPrice(Double price) {
        this.price = price;
    }

    public void setCategory(String category) {
        this.category = category;
    }

    public void setIsNew(boolean isNew) {
        if (isNew) {
            this.isNew = true;
        } else {
            this.isNew = false;
        }
    }

    @Override
    public String toString() {
        return "name=" + name + ", description=" + description + ", price=" + price + ", category=" + category + ", isNew=" + isNew;
    }

    @Override
    public boolean equals(Object menuItemToCheck) {
        if (menuItemToCheck == this) {
            return true;
        }
        if (menuItemToCheck == null) {
            return false;
        }
        if (!(menuItemToCheck instanceof MenuItem)) {
            return false;
        }
        MenuItem menuItem = (MenuItem) menuItemToCheck;
        return menuItem.getName() == this.getName() && menuItem.getDescription() == this.getDescription() &&
              menuItem.getPrice() == this.getPrice() && menuItem.getCategory() == this.getCategory() &&
              menuItem.getIsNew() == this.getIsNew();
    }
}

