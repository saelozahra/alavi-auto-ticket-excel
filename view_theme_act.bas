B4J=true
Group=Default Group
ModulesStructureVersion=1
Type=StaticCode
Version=9.8
@EndOfDesignText@
'Static code module
Sub Process_Globals
	Private fx As JFX
	Private MainForm As Form
	Private xui As XUI
End Sub

Sub AppStart (Form1 As Form, Args() As String)
	MainForm = Form1
	MainForm.SetFormStyle("UNIFIED")
	'MainForm.RootPane.LoadLayout("Layout1") 'Load the layout file.
	MainForm.Show
	
	
	Dim poCan As Canvas
	poCan.Initialize("")
	MainForm.RootPane.AddNode(poCan, 0, 0, MainForm.Width, MainForm.Height)
	MainForm.RootPane.Style =  "-fx-background-image: url('" & File.GetUri(File.DirAssets, "theme.png") & "'); -fx-background-repeat: no-repeat; -fx-background-size: contain; -fx-background-position: center center;"
	Dim Shabnam As Font = fx.LoadFont(File.DirAssets, "Shabnam.ttf", 12dip)
	Dim poImg As Image = WrapDrawnText(MainForm.RootPane, "آینده - شعبه مرکزی", fx.Colors.DarkGray, Shabnam, "TOP_RIGHT", 133dip)
	poCan.DrawImage(poImg, 200dip, 160dip, poImg.Width, poImg.Height)
	
	
	Dim out As OutputStream = File.OpenOutput(File.DirApp, "temps.png", False)
	MainForm.RootPane.SetSize(551,779)
	MainForm.RootPane.Snapshot.WriteToStream(out)
	
End Sub

Public Sub WrapDrawnText(Container As AnchorPane, Text As String, TextColor As Paint, TextFont As Font, TextAlign As String, MaxWidth As Int) As Image
	Dim poImg As Image
	Dim poLbl As Label
   
	'Create a label
	poLbl.Initialize("")
	poLbl.WrapText = True
	poLbl.Font = TextFont
	poLbl.TextColor = TextColor
	poLbl.Alignment = TextAlign
	poLbl.Text = Text
	poLbl.Style = "-fx-background-color: rgba(0, 0, 0, 0);"
	Container.AddNode(poLbl, -MaxWidth, 0, MaxWidth, -1)
	poImg = poLbl.Snapshot
	poLbl.RemoveNodeFromParent

	Return poImg
End Sub