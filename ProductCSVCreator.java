package str;
import java.io.FileWriter;
import java.io.IOException;
public class ProductCSVCreator {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		// Define the product details
String[] productNames = {"Dell G3 Gaming Laptop", "Recertified Dell ALIENWARE 17 R3 Gaming Laptop", "Dell G15 Gaming Laptop", "Recertified Dell ALIENWARE 17 R1 Gaming Laptop", "Dell G15 Ryzen Edition Gaming Laptop", "Dell Alienware 15 R4 Gaming Laptop", "Dell G15 Ryzen Edition 15 Premium Gaming Laptop", "Dell Gaming G15 5510 Gaming Laptop", "Dell G15 Gaming Laptop", "Alienware m15 R4 Gaming Laptop"};
double[] productPrices = {1774.20, 999.90, 839.99, 849.90, 919.00, 7636.08, 1109.00, 1974.85, 899.00, 2018.99};
String[] itemNumbers = {"SKU-001", "SKU-002", "SKU-003", "SKU-004", "SKU-005", "SKU-006", "SKU-007", "SKU-008", "SKU-009", "SKU-010"};
String[] modelNumbers = {"G3579-5965BLK-PUS", "17", "G15RE-A975GRY-N", "Alienware17R1", "Dell G15 Ryzen Edition Gaming Laptop", "AW15R4-7712SLV-PUS+QQ2-00728", "G15", "K535V", "Model-09", "AWM15R4-7726BLK-PUS"};
String[] productCategories = {"Dell Gaming Laptops", "Dell Gaming Laptops", "Dell Gaming Laptops", "Dell Gaming Laptops", "Dell Gaming Laptops", "Dell Gaming Laptops", "Dell Gaming Laptops", "Dell Gaming Laptops", "Dell Gaming Laptops", "Dell Gaming Laptops"};
String[] productDescriptions = {"Dell G3 15 3579 15.6 inch FHD (1920 x 1080) IPS Anti-Glare-LED-Backlit Display 8th Generation Intel Core i5 8300H Processor (Quad-Core 8MB Cache up to 3.9GHz Turbo Boost) 8GB 2666MHz DDR4 RAM 256GB (SSD) NVIDIA GeForce GTX 1050 4GB GDDR5 graphics memory Walmart Protection Plans [sold separately] for laptops covers accidental damage like cracked screens and liquid damage as well as battery mechanical and electrical failure from normal use", "Refurbished and recertified Grade A condition Come with laptop & charger in brown box Intel Quad Core i7 6820HK 2.70 GHz Processor 16GB Ram Memory 256GB SSD + 1 TB Hard Drive Nvidia GeForce GTX 980M 4GB Graphics Webcam Wi-Fi RGB Backlit Full Size Keyboard 17.3 inch Full High Definition Display 1920 x 1080 Windows 10 Pro Operating System", "Operating System: Windows 11 Home-Processor: AMD Ryzen 7 5800H 3.2GHz-Display: 15.6 inch 120Hz FHD Display-Memory: 8GB RAM-Storage Device: 512GB PCIe SSD-Dedicated Graphics: NVIDIA GeForce RTX 3050 Ti|4GB-HD Audio-Stereo Speakers","Refurbished Grade A Condition Come with computer & power adapter only 30 Days Return Warranty Intel Core i7-4700MQ 2.40Ghz Processor 8GB Ram Memory 500 Hard Drive Nvidia GeForce GTX 765M 2GB Ram Windows 10 Home Wifi Webcam Back-lit RGB Keyboard 17.3inch Full High Definition Display 1920 x 1080p","Dell G15 Ryzen Edition Gaming 15 Laptop 15.6 inch FHD (1920 x 1080) 120Hz 250 nits WVA Anti- Glare LED Backlit Narrow Border Display AMD Hexa-Core Ryzen 5 5600H (3.3GHz base frequency up to 4.2 GHz 16MB L3 cache 12 Threads) Dedicated NVIDIA GeForce RTX 3050 4GB GDDR6 Integrated AMD Radeon Graphics Backlit Keyboard Alienware-inspired Thermal Cool System Wi-Fi 6 AX1650 (2x2) and Bluetooth HD RGB Webcam with Digital-array Windows 10 Home","Dell Alienware 15 R4 15.6inch Gaming Laptop Intel Core i7 16GB + Office 365 Bundle","Display: 15.6inch FHD (1920 x 1080) 120Hz Display-Memory: 8GB DDR4-Storage: 512GB SSD-Keyboard: Backlit Keyboard-Dimensions: 14.06inch x 10.7inch x 1.06inch-Approximate Weight: 5.4 pounds","Dell Gaming G15 5510 15.6 Inch RTX 3060 Gaming Laptop Full HD-Intel Core i7-10870H 16GB DDR4 RAM 512GB SSD NVIDIA GeForce RTX 3060 6GB GDDR6 Windows 10 Home-Grey(Latest Model)","With the latest AMD Ryzen 5 5600H 6-core processor and the latest GeForce RTX 3050 (4GB dedicated GDDR6 VRAM) powered by award-winning architecture with new Ray Tracing Cores Tensor Cores and streaming multiprocessors support DirectX 12 Ultimate for the ultimate gaming performance your G15 gaming laptop is packed with incredible power for all your games-Never miss a chance and clutch the game on the 15.6inch Full HD widescreen with 1920 x 1080 resolution 120Hz 250 nits WVA Anti- Glare LED Backlit Narrow Border Display-Say GoodBye to Internet lag & loss Killer Ethernet E2600 and Intel Wi-Fi 6 AX201 gives you an edge online by taking control of your network and prioritizing your gameplay-Never feel the annoying heat while your hand is hot our thermal systems utilize copper piping to dissipate heat as it’s pulled through the top of the keyboard and bottom of the system via four large exhaust vents","15.6-inch FHD (Full HD 1920 x 1080) 300Hz 3ms 300-nits 100% sRGB color gamut 10th Generation Intel Core i7-10870H (8-Core 16MB Cache up to 5.0GHz Max Turbo Frequency) 16GB 2933MHz DDR4 1 TB PCIe SSD Killer Wi-Fi 6 AX1650i 802.11ax 2x2 Wireless LAN + Bluetooth 5.1"};

// Create the CSV file and write the header
try (FileWriter writer = new FileWriter("D:\\products.csv")) {
writer.write("Product Name,Product Price($),Item Number,Model Number,Product Category,Product Description\n");

// Write each product's details as a row in the CSV file
for (int i = 0; i < productNames.length; i++) {
writer.write(productNames[i] + "," + productPrices[i] + "," + itemNumbers[i] + "," + modelNumbers[i] + "," + productCategories[i] + "," + productDescriptions[i] + "\n");
            }

System.out.println("CSV file created successfully.");
        } catch (IOException e) {
            System.out.println("Error writing CSV file: " + e);
        }
    }
}

