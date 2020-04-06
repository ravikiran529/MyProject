from selenium import webdriver
import pytest
class TestOrangeHRM():
    @pytest.yield_fixture()
    def setup(self):
        self.driver=webdriver.Chrome(executable_path=r'C:\Users\DELL\PycharmProjects\SeleniumTest\Browser\chromedriver.exe')
        self.driver.maximize_window()
        yield
        self.driver.close()
        print("test completed")
    def test_titlepage(self,setup):
        self.driver.get("https://opensource-demo.orangehrmlive.com/")
        assert self.driver.title=="OrangeHRM"
    def test_login(self,setup):
        self.driver.get("https://opensource-demo.orangehrmlive.com/")
        self.driver.find_element_by_id("txtUsername").click()
        self.driver.find_element_by_id("txtUsername").clear()
        self.driver.find_element_by_id("txtUsername").send_keys("Admin")
        self.driver.find_element_by_id("txtPassword").send_keys("admin123")
        self.driver.find_element_by_id("btnLogin").click()
        assert self.driver.title == "OrangeHRM"

