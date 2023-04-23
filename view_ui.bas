B4J=true
Group=Default Group
ModulesStructureVersion=1
Type=Class
Version=9.8
@EndOfDesignText@
'Class module
Sub Class_Globals
	Private fx As JFX
	Private frm As Form
	Private xui As XUI
	Private txtName As TextField
	Dim poCan As Canvas
End Sub

'Initializes the object. You can add parameters to this method if needed.
Public Sub Initialize (Parent As Form)
	frm.Initialize("frm", 551dip, 779dip)
	frm.Title = "خروجی فرم"
'	frm.SetFormStyle("UTILITY")
	frm.SetFormStyle("UNDECORATED")
	frm.RootPane.LoadLayout("view_ticket_layout")
	frm.SetOwner(Parent)
		
	frm.RootPane.Style =  "-fx-background-image: url('" & File.GetUri(File.DirAssets, "theme.png") & "'); -fx-background-repeat: no-repeat; -fx-background-size: contain; -fx-background-position: center center;"
	Dim Shabnam As Font = fx.LoadFont(File.DirAssets, "Shabnam.ttf", 15dip)
	
	Dim BNameImg As Image = WrapDrawnText(frm.RootPane, Main.BCName, fx.Colors.DarkGray, Shabnam, "TOP_RIGHT", 202dip)
	poCan.DrawImage(BNameImg, 98dip, 160dip, BNameImg.Width, BNameImg.Height)
	
	Dim UserNameImg As Image = WrapDrawnText(frm.RootPane, Main.UName, fx.Colors.DarkGray, Shabnam, "TOP_RIGHT", 195dip)
	poCan.DrawImage(UserNameImg, 184dip, 230dip, UserNameImg.Width, UserNameImg.Height)
	
	Dim FatherNameImg As Image = WrapDrawnText(frm.RootPane, Main.FatherName, fx.Colors.DarkGray, Shabnam, "TOP_RIGHT", 145dip)
	poCan.DrawImage(FatherNameImg, 0dip, 228dip, FatherNameImg.Width, FatherNameImg.Height)
	
	Dim MelliImg As Image = WrapDrawnText(frm.RootPane, Main.MelliCode, fx.Colors.DarkGray, Shabnam, "TOP_RIGHT", 313dip)
	poCan.DrawImage(MelliImg, 38dip, 265dip, MelliImg.Width, MelliImg.Height)
	
	Dim ShabnamRiz As Font = fx.LoadFont(File.DirAssets, "Shabnam.ttf", 9dip)
	Dim SHNImg As Image = WrapDrawnText(frm.RootPane, "شماره نامه:ح/"& Main.MelliCode.SubString(3), fx.Colors.Black, ShabnamRiz, "TOP_RIGHT", 100dip)
	poCan.DrawImage(SHNImg, 22dip, 54dip, SHNImg.Width, SHNImg.Height)
	
	Dim MablaghRilImg As Image = WrapDrawnText(frm.RootPane, Main.MablaghRil, fx.Colors.DarkGray, Shabnam, "TOP_RIGHT", 140dip)
	poCan.DrawImage(MablaghRilImg, 264dip, 370dip, MablaghRilImg.Width, MablaghRilImg.Height)
	
'	Dim fc As FileChooser
'	fc.Initialize
'	fc.SetExtensionFilter("نامه را ذخیره کنید",Array As String("*.jpg","*.jpeg","*.png"))
'	fc.InitialFileName=Main.UName
'	Dim u As String
'	u = fc.ShowSave(frm)
''	If File.GetFileParent(u) == False Then
''	
''	Else
'		File.WriteString(File.DirTemp, "save_dir", File.GetFileParent(u))
''	End If
'	Dim out As OutputStream = File.OpenOutput(File.GetFileParent(u), File.GetName(u), False)
'	frm.RootPane.SetSize(551,779)
'	frm.RootPane.Snapshot.WriteToStream(out)
	
'	xui.MsgboxAsync("تصویر ذخیره شد", "نتیجه")
	
	fx.Clipboard.SetImage(frm.RootPane.Snapshot)
	
End Sub

Public Sub Show As String	'	Can be different types.
	frm.ShowAndWait
	Return txtName.Text
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

Public Sub poCan_MouseClicked (EventData As MouseEvent)
	frm.Close
End Sub
Public Sub poCan_MousePressed (EventData As MouseEvent)
	frm.Close
End Sub